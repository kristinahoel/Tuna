
/**
 * Write a description of class Sykkel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sykkel
{
    // Info
    private String farge;
    private String type;
    private int pris;
    private Gir gir;
    private int hastighet;
    private Bremse forbrems;
    private Bremse bakbrems;
    
    /**
     * Ny constructor.
     */
    public Sykkel()
    {
        farge = "blå";
        type = "DBS";
        pris = 3999;
        gir = new Gir(10);
        forBrems = new Bremse(5, "Shimano");
        bakBrems = new Bremse(5, "Shimano");
    }
    
    
    /**
     * Gammel constructor.
     */
    public Sykkel(String farge, String type, int pris, int maxGear)
    {
        this.farge = farge;
        this.type = type;
        this.pris = pris;
        this.gir = gir;
        this.hastighet = hastighet;
        this.forbrems = forbrems;
        this.bakbrems = bakbrems;
    }

    /**
     * @return En stringrepresentasjon av denne sykkelens detaljer.
     */
    public String toString()
    {
        String detaljer = farge + ", " + type + ", " + pris;
        return detaljer;
    }
    
    /**
     * @return Sykkelens farge
     */
    public String getFarge()
    {
        return farge;
    }
}
