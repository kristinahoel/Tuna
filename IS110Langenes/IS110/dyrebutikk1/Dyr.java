
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
        art = "hund";
        navn = "dixie";
        fødselsdato = "23. oktober 1996";
        pris = 5000;
    }

    /**
     * Eksempel på getter
     *
     * @param  
     * @return    navnet på hunden
     */
    public String getNavn()
    {
        return navn;
    }
}
