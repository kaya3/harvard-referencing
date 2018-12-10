package bcu.harvardreferencing;

import java.util.List;

public class JournalArticle extends Publication {
    private final String journalName;
    private final int volume;
    private final int issue;
    private final int pageFrom;
    private final int pageTo;
    
    public JournalArticle(
        List<Author> authors, String title, int year,
        String journalName, int volume, int issue, int pageFrom, int pageTo
    ) {
        super(authors, title, year);
        this.journalName = journalName;
        this.volume = volume;
        this.issue = issue;
        this.pageFrom = pageFrom;
        this.pageTo = pageTo;
    }
    
    public String getJournalName() {
        return journalName;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public int getIssue() {
        return issue;
    }
    
    public int getPageFrom() {
        return pageFrom;
    }
    
    public int getPageTo() {
        return pageTo;
    }
    
    @Override
    public String harvardReference() {
        String reference = super.harvardReference();
        
        reference += " " + journalName + ", ";
        reference += volume + "(" + issue + "), ";
        reference += "pp. " + pageFrom + "-" + pageTo + ".";
        
        return reference;
    }
}
