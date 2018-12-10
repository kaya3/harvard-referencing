package bcu.harvardreferencing;
public class InstitutionalAuthor implements Author {
    private final String name;
    
    public InstitutionalAuthor(String name) {
        this.name = name;
    }
    
    @Override
    public String fullName() {
        return name;
    }
    
    @Override
    public String citeName() {
        return name;
    }
}
