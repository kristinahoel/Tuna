
/**
 * Klasse for gir.
 *
 * @author Kristina
 * @version 1.2
 */
public class Gir
{
    private int maxGear;
    private int gearNaa;

    /**
     * Constructor
     */
    public Gir(int maxGear){
        this.maxGear = maxGear;
        gearNaa = 1;
    }

    /**
     * Eksempel på getter.
     */
    public int getGear()
    {
        return gearNaa;
    }
    
    /**
     * Metode for writeGear. Denne brukes i en annen klasse.
     */
    public void writeGear()
    {
        System.out.println ("Gir nå: " + gearNaa + "," + " Max gear: " 
        + maxGear);
    }
}
