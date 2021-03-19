import java.util.ArrayList;
/**
 * Et objekt fra denne klassen representerer et universitet.
 *
 * @author Kristina
 * @version 1.0
 */
public class StudentSystem
{
    // felt
    private String uniNavn;
    private ArrayList<Student> studenter;

    /**
     * Constructor.
     */
    public StudentSystem(String uniNavn)
    {
        this.uniNavn = uniNavn;
        studenter = new ArrayList<Student>();
    }

    /**
     * Legge til ny student i lista som allerede finnes som et objekt.
     * Her må vi ha parameter, akkurat som på set-metoder.
     */
    public void addStudent(Student nyStudent)
    {
        studenter.add (nyStudent);
    }
    
    /**
     * Liste alle studentene med for-each løkke. Her har Hallgeir kalt
     * "student" for loper, men det spiller ingen rolle.
     */
    public void listAlleStudenterMedForEach()
    {
        System.out.println("Alle studenter på " + uniNavn + ":");
        System.out.println("=========================================");
        for(Student student : studenter)
            student.listStudent();
        System.out.println("=========================================");
    }
    
    /**
     * Liste alle studentene med while-løkke. Index starter på null siden
     * det er starten på lista vår. Hallgeir kaller "index" for teller, men
     * det spiller nok en gang ingen rolle.
     */
    public void listAlleStudenterMedWhile()
    {
        int index = 0;
        while(index < studenter.size())
        {
            studenter.get(index).listStudent();
            index++;
        }
    }
    
    /**
     * Liste alle studenter på ett studie. Det ligner på å liste alle, men
     * vi får input om hvilket studie vi ønsker som parameter. For hvert 
     * element i lista,før vi skriver dem ut må vi sjekke om studiet er det 
     * vi søker. getStudium-metoden fra Student-klassen brukes, og 
     * String-metoden "equals" eller "contains" det sistnevnte er mindre 
     * streng.
     * studiet = logisk variabelnavn, men kunne likegjerne vært brukt før.
     * det sentrale er at parameter er likt det som står etter contains.
     */
    public void listAllePåEttStudie(String studiet)
    {
        for(Student student : studenter)
        //Sjekk om de går på ønsket studie. Hvis ja; print.
        if(student.getStudium().contains(studiet))
            student.listStudent();
    }
    
    /**
     * Finne en student via navn.
     * Passer best med while-løkke siden for each legger opp til at du skal
     * gjennom alle, men det kan hende navnet vi leter etter er nr en. 
     * mtp cohesion skal vi bare finne ham, kanskje ikke skrives ut.
     * da kan den godt returnere et studentobjekt.
     * vi velger likevel at den returnerer studenter og skriver den ut.
     * boka s.118 bruke for each siden den lister alle (?)
     */
    public Student finnStudent(String navnet)
    {
        int index = 0; //hvor vi er i lista
        boolean funnet = false;
        Student enStudent = null; //refere funnet student, ellers null
        //metoden skal peke en student hvis hen finnes
        //nå kan vi begynne på løkka. begge betingelsene må oppfylles.
        while((funnet == false) && (index < studenter.size()))   
        {
            if(studenter.get(index).getStudentNavn().contains(navnet))
            {
            funnet = true;
            studenter.get(index).listStudent();
            enStudent = studenter.get(index);
            }
            index++;
        } //slutt på while-løkka.
        //når vi har kommet hit har vi enten et funn, eller slutt på lista
        return enStudent;
    }
    
    /**
     * Finne en student på en litt enklere måte. Løper gjennom lista og
     * skriver ut en student om hen finnes.
     */
    public void finnStudentEnklere(String navnet)
    {
        for(Student student : studenter)
        {
            if(student.getStudentNavn().contains(navnet))
            {
                student.listStudent();
                break;
            }
        }
    }
    
    /**
     * Slette en student basert på studentnummer. Hvis vi skulle sletta 
     * flere studenter, eks. alle på et studie, kunne vi ikke brukt
     * for-each løkka. Siden vi kun skal slette én bruker vi hvilken løkke
     * vi vil. Ellers burde vi brukt Iterator.
     * vi velger mellom while og for each og lander på while.
     * 
     * siden H hadde studnr som String og jeg har som int har min kode ==
     * istedenfor .equals i if-setningen.
     */
    public void slettStudent(int studentnummeret)
    {
        int index = 0;
        boolean slettet = false;
        //etter vi har initialisert disse to tingene starter vi på løkka.
        while((slettet == false) && (index < studenter.size()))
        //så lenge dette er tilfellet skal vi fortsette
        {
            if(studenter.get(index).getStudentNummer()==(studentnummeret))
            {
            //vi må finne studenten og oppdatere boolean
            studenter.remove(index);
            slettet = true;
            }
            index++;
        }
    }
}
