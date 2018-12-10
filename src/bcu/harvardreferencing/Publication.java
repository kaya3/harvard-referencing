package bcu.harvardreferencing;

import java.util.Collections;
import java.util.List;

public class Publication {
    private final List<Author> authors;
    private final String title;
    private final int year;
    
    public Publication(List<Author> authors, String title, int year) {
        if(authors.isEmpty()) {
            throw new IllegalArgumentException("Empty authors list");
        }
        
        this.authors = authors;
        this.title = title;
        this.year = year;
    }
    
    public List<Author> getAuthors() {
        return Collections.unmodifiableList(authors);
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYear() {
        return year;
    }
    
    public String harvardReference() {
        return authorNames() + " (" + year + ") " + title + ".";
    }
    
    public String authorNames() {
        String nameString = "";
        
        int secondLast = authors.size() - 2;
        for(int i = 0; i < authors.size(); i++) {
            nameString += authors.get(i).fullName();
            if(i < secondLast) {
                nameString += ", ";
            } else if(i == secondLast) {
                nameString += " and ";
            }
        }
        
        return nameString;
    }
}
