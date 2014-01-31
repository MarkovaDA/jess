package example.amzs.demo;

import java.util.ArrayList;
import java.util.HashMap;

import example.amzs.model.CatalogTopics;
import example.amzs.model.Issue;
import example.amzs.model.IssueKeyword;


public class Database {
	private ArrayList<CatalogTopics> topics;
	private HashMap<Integer, Issue> issues;

	public Database() {
		createCatalogItems();
		createIssues();
	}
	
	private void createCatalogItems() {
		topics = new ArrayList<CatalogTopics>();
		topics.add(new CatalogTopics("nesreca", 1));
		topics.add(new CatalogTopics("motor", 2));
		topics.add(new CatalogTopics("ne vzge", 3));
		topics.add(new CatalogTopics("na strehi", 4));
	}
	
	private void createIssues() {
		issues = new HashMap<Integer, Issue>();
		
		ArrayList<IssueKeyword> issueKeywords = new ArrayList<IssueKeyword>();
		issueKeywords.add(new IssueKeyword("nesreca", 1));
		issueKeywords.add(new IssueKeyword("na strehi", 4));
		issues.put(new Integer(123), new Issue(issueKeywords));
		
	}
	
	public ArrayList<CatalogTopics> getAllTopics() {
		return topics;
	} 
	
	public Issue getIssue(int issueNumber) {
		return (Issue) issues.get(new Integer (issueNumber));
	}
}
