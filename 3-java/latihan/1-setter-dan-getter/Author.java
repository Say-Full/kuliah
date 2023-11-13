
/**
 * This class is describing about the author identity.
 *
 * @Name : Muhammad Saifullah Sani
 * @NPM  : 1908107010062
 */
public class Author
{
    private String name;
    private String email;
    private char gender;

    /**
     * Constructor for objects of class Author
     */
    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        
        if(!((gender == 'p' || gender == 'l') && (gender == 'P' || gender == 'L')) )
            this.gender = 'L';
        else 
            this.gender = gender;
    }

    /**
     * Below are accessor and mutator methods.
     */
    public String getName()
    {
        return this.name;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public char getGender()
    {
        return this.gender;
    }
    
    public String toString()
    {
        return this.name + " (" + this.gender + ") at " + this.email;
    }
}
