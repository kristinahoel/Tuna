
/**
 * Klasse for sykkel.
 *
 * @author Kristina
 * @version 1.2
 */
public class Sykkel
{
    private String farge;
    private String type;
    private int pris;
    private Gir gir;
    private int hastighet;
    private Bremse forBrems;
    private Bremse bakBrems;

    /**
     * Constructor.
     */
    public Sykkel()
    {
        farge = "blå";
        type = "DBS";
        pris = 3999;
        gir = new Gir(10);
        hastighet = 50;
        forBrems = new Bremse(5, "Shimano");
        bakBrems = new Bremse(5, "Shimano");
    }

    public Sykkel(String farge, String type, int pris, int maxGear)
    {
        this.farge = farge;
        this.type = type;
        this.pris = pris;
        gir = new Gir(maxGear);
        this.hastighet = hastighet;
        forBrems = new Bremse(5, "Shimano");
        bakBrems = new Bremse(5, "Shimano");
    }

    /**
     * Metode for writing.
     */
    public void writeSykkel()
    {
        System.out.println ("Farge: " + farge);
        System.out.println ("Type: " + type);
        System.out.println ("Pris: " + pris);
        System.out.println ("Fart: " + hastighet);
        System.out.println ("Gir:");
        gir.writeGear();
        System.out.println ("Bakbrems: ");
        bakBrems.writeBrems();
        System.out.println ("Forbrems: ");
        forBrems.writeBrems();
    }

    /**
     * Eksempel på getter.
     * @return Sykkelens farge
     */
    public String getFarge()
    {
        return farge;
    }
    
    /**
     * Eksempel på getter.
     * @return Sykkelens farge
     */
    public int getPris()
    {
        return pris;
    }
}
