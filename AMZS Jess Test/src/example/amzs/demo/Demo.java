package example.amzs.demo;

import java.util.Iterator;

import jess.JessException;
import example.amzs.engine.Engine;
import example.amzs.model.IssueKeyword;

public class Demo {

	public static void main(String[] args) {

		try {
			
			Database database = new Database();
			Engine engine = new Engine(database);
			
			processIssue(database, engine, 123);

			
		} catch (JessException e) {
			e.printStackTrace();
		}
		
	}
	
		
	private static void processIssue(Database database, Engine engine, int issueNumber) throws JessException {
		Iterator<IssueKeyword> keywords;
		Iterator response;
		System.out.println("Keywords for issue " + issueNumber + ":");
		keywords = database.getIssue(issueNumber).getKeywords();
		while (keywords.hasNext()) {
			System.out.println("   " + keywords.next());
		}			
		
		response = engine.run(issueNumber);
		System.out.println("Response for issue " + issueNumber + ":");
		while (response.hasNext()) {
			System.out.println("   " + response.next());
		}
		System.out.println();
	}

}
