package example.amzs.engine;

import java.util.Iterator;

import example.amzs.demo.Database;
import example.amzs.model.Issue;
import example.amzs.model.Response;
import jess.*;


public class Engine {
		private Rete rete;
		private WorkingMemoryMarker marker;
		private Database database;
		
		public Engine(Database _database) throws JessException {
			rete = new Rete();
			rete.reset();
			
			rete.batch("rules.clp");
			
			database = _database;
			rete.addAll(database.getAllTopics());
			
			marker = rete.mark();
		}
		
		private void loadIssueData(int issueNumber) throws JessException {
	        // Retrieve the topics from the database
	    	Issue issue = database.getIssue(issueNumber);
	        
	    	if (issue != null) {
	    		// Add the issue and its contents to working memory
	    		rete.add(issue);
	    		rete.addAll(issue.getKeywords());
	    	}
	    }
		
		public Iterator run(int issueNumber) throws JessException {
	    	rete.resetToMark(marker);

	    	loadIssueData(issueNumber);
	       
	        rete.run();
	        
	        // Return the list of responses created by the rules
	        return rete.getObjects(new Filter.ByClass(Response.class));
		}
		
}
