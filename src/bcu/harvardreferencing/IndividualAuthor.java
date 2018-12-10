package bcu.harvardreferencing;

public class IndividualAuthor implements Author {
    private final String lastName;
    private final String initials;
    
    public IndividualAuthor(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }
    
    @Override
    public String fullName() {
        return lastName + ", " + initials;
    }
    
    @Override
    public String citeName() {
        return lastName;
    }
}
