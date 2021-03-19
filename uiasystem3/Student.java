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
     * Constructor
     */
    public Student(String navn, int studentnummer, String studium)
    {
        // initialise instance variables
        this.navn = navn;
        this.studentnummer = studentnummer;
        this.studium = studium;
    }

    public String getStudentNavn()
    {
        return navn;
    }

    public void setStudentNavn(String navn)
    {
        this.navn = navn;
    }
    
    public int getStudentNummer()
    {
        return studentnummer;
    }

    public void setStudentNummer(int studentnummer)
    {
        this.studentnummer = studentnummer;
    }
    
    public String getStudium()
    {
        return studium;
    }

    public void setStudium(String studium)
    {
        this.studentnummer = studentnummer;
    }
    
    public void listStudent()
    {
        System.out.println("Navn: " + navn);
        System.out.println("Studentnummer: " + studentnummer);
        System.out.println("Studium: " + studium);
    }
}