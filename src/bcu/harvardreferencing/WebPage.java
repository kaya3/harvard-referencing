package bcu.harvardreferencing;

import java.util.List;

public class WebPage extends Publication {
    private final String url;
    private final String dateAccessed;
    
    public WebPage(
        List<Author> authors, String title, int year,
        String url, String dateAccessed
    ) {
        super(authors, title, year);
        this.url = url;
        this.dateAccessed = dateAccessed;
    }
    
    public String getURL() {
        return url;
    }
    
    public String getDateAccessed() {
        return dateAccessed;
    }
    
    @Override
    public String harvardReference() {
        String reference = super.harvardReference();
        
        reference += " Available at: " + url;
        reference += " [Accessed " + dateAccessed + "].";
        
        return reference;
    }
}
