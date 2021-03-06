
/**
 * Klasse for dyrene i dyrebutikken.
 *
 * @author Kristina Hoel
 * @version 1.0
 */
public class Dyr
{
    private String art;
    private String navn;
    private String fødselsdato;
    private int pris;

    /**
     * Constructor. 
     */
    public Dyr()
    {
        art = "Hund";
        navn = "Dixie";
        fødselsdato = "23. oktober 1996";
        pris = 5000;
    }

    /**
     * Eksempel på getter
     */
    public String getArt()
    {
        return art;
    }
    
    /**
     * Eksempel på getter
     */
    public String getNavn()
    {
        return navn;
    }

     /**
     * Eksempel på getter
     */
    public String getFødselsdato()
    {
        return fødselsdato;
    }
    
    /**
     * Eksempel på getter
     */
    public int getPris()
    {
        return pris;
    }

    /**
     * Skriv dyr
     */
    public void skrivDyr() {
        System.out.println("Art: " + art);
        System.out.println("Navn: " + navn);
        System.out.println("Fødselsdato: " + fødselsdato);
        System.out.println("Pris: " + pris);
    }
}
