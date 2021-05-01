import java.util.ArrayList;
/**
 * Klasse for å holde studenter.
 *
 * @author Kristina
 * @version 1.0
 */
public class Student
{
    // felt
    private String navn;
    private int studentnummer;
    private String studium;

    /**
     * Constructor.
     */
    public Student(String navn, int studentnummer, String studium)
    {
        // initialise instance variables
        this.navn = navn;
        this.studentnummer = studentnummer;
        this.studium = studium;
    }

    /**
     * Getter.
     */
    public String getStudentNavn()
    {
        return navn;
    }

    /**
     * Getter.
     */
    public int getStudentNummer()
    {
        return studentnummer;
    }

    /**
     * Getter. 
     */
    public String getStudium()
    {
        return studium;
    }
    
    /**
     * Liste alle studenter.
     */
    public void listAlleStudenter()
    {
        System.out.println("Navn: " + navn);
        System.out.println("Studentnummer: " + studentnummer);
        System.out.println("Navn: " + navn);
    }
}
