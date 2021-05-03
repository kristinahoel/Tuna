
/**
 * En dyreklasse. Dyr brukes som en abstrakt superklasse for mer spesifikke
 * dyreklasser.
 *
 * @author Kristina
 * @version 1.0
 */
abstract class Dyr
{
    private String navn;
    private int alder;

    /**
     * Constructor.
     */
    public Dyr(String navn, int alder)
    {
        this.navn = navn;
        this.alder = alder;
    }

    /**
     * Getter.
     */
    public String getNavn()
    {
        return navn;
    }
    
    /**
     * Returner en string representasjon av dette objektet.
     */
    public String toString()    // redefinert fra "Object"
    {
        return "Navn: " + navn +
               "Alder: " + alder;
    }
    
 
}
