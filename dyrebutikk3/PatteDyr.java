
/**
 * Write a description of class PatteDyr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatteDyr extends Dyr
{
    private int drektighetsTid;
    private int antallUnger;
    
    /**
     * Constructor for objects of class PatteDyr
     */
    public PatteDyr(String art, String navn, String fødselsdato, int pris, int drektighetsTid, int antallUnger)
    {
        super(art, navn, fødselsdato, pris);
        this.drektighetsTid = drektighetsTid;
        this.antallUnger = antallUnger;
    }

    /**
     * Eksempel getter.
     */
    public int getDrektighetsTid()
    {
        return drektighetsTid;
    }
    
    /**
     * Eksempel getter.
     */
    public int getAntallUnger()
    {
        return antallUnger;
    }
    
    /**
     * Skriv dyr igjen. Eksempel på override. Vi gir ny mening til metoden som fins.
     */
    public void skrivDyr()
    {
        super.skrivDyr();
        System.out.println("Drektig, antall uker: " + drektighetsTid);
        System.out.println("Antall unger: " + antallUnger);
    }
}
