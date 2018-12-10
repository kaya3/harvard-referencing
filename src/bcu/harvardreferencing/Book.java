package bcu.harvardreferencing;
import java.util.List;

public class Book extends Publication {
    private final String publisher;
    
    public Book(
        List<Author> authors, String title, int year,
        String publisher
    ) {
        super(authors, title, year);
        this.publisher = publisher;
    }
    
    public String getPublisher() {
        return publisher;
    }
        
    @Override
    public String harvardReference() {
        return super.harvardReference() + " " + publisher + ".";
    }
}
