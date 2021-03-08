import java.util.ArrayList;
/**
 * En dyrebutikk som selger dyr.
 *
 * @author Kristina Hoel
 * @version 1.0
 */
public class Dyrebutikk
{
    private String butikkNavn;
    private ArrayList<Dyr> kolleksjonDyr;

    /**
     * Constructor.
     */
    public Dyrebutikk(String butikkNavn)
    {
        this.butikkNavn = butikkNavn;
        kolleksjonDyr = new ArrayList<Dyr>();
    }

    /**
     * Legg til et eksisterende dyr i butikken.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addDyr(Dyr newDyr)
    {
        kolleksjonDyr.add (newDyr);
    }
}
