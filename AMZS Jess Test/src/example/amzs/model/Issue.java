package example.amzs.model;

import java.util.ArrayList;
import java.util.Iterator;


public class Issue {
	private ArrayList<IssueKeyword> keywords;
	
	public Issue(ArrayList<IssueKeyword> _keywords) {
		keywords = new ArrayList<IssueKeyword>(_keywords);
//		for (Iterator it = keywords.iterator(); it.hasNext();) {
//		    IssueKeyword keyword = (IssueKeyword) it.next();
//		}
    } 
	
	public Iterator<IssueKeyword> getKeywords() {
        return keywords.iterator();
	}
}
