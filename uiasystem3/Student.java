public class Student
{
    // felt
    private String navn;
    private int studentnummer;
    private String studium;
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
    public int getStudentNummer()
    {
        return studentnummer;
    }

    public String getStudium()
    {
        return studium;
    }
    public void listStudent()
    {
        System.out.println("Navn: " + navn);
        System.out.println("Studentnummer: " + studentnummer);
        System.out.println("Navn: " + navn);
    }
}