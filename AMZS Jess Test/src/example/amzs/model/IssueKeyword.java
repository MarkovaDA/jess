package example.amzs.model;

public class IssueKeyword {

    private int partNumber;
    private String description;
    
    public IssueKeyword(String _Description, int _PartNumber) {
    	partNumber = _PartNumber;
    	description = _Description;	
	}
    	

    public int getPartNumber() {
    	return partNumber;
    }
    
    public String getDescription() {
    	return description;
    }

    public String toString() {
    	return description;
    }
}
