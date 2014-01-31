package example.amzs.model;

public class CatalogTopics {
	    private String description;
	    private int topicNumber;

	    public CatalogTopics(String _description, int _topicNumber) {
		description = _description;
		topicNumber = _topicNumber;
	    }

	    public int getPartNumber() {
		return topicNumber;
	    }
		
	    public String getDescription() {
		return description;
	    }
		

}
