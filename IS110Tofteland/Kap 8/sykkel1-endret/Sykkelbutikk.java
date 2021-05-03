import java.util.ArrayList;

/**
 * En sykkelbutikk som holder detaljer om syklene den selger.
 *
 * @author Kristina 
 * @version 1.2
 */
public class Sykkelbutikk
{
    // Navnet til butikken
    private String butikkNavn;
    // En ArrayList for å lagre sykler
    private ArrayList<Sykkel> sykler;
    
    /**
     * Constructor.
     */
    public Sykkelbutikk(String butikkNavn)
    {
        this.butikkNavn = butikkNavn;
        sykler = new ArrayList<Sykkel>();
    }

    /**
     * Legge til en eksisterene sykkel i lista vår.
     * @param   newSykkel
     */
    public void addSykkel(Sykkel newSykkel)
    {
        sykler.add(newSykkel);
    }
    
    /**
     * Registrere ny sykkel i butikken.
     * @param  beskrivelse av sykkelen.
     */
    public void nySykkel(String farge, String type, int pris, int maxGear)
    {
        Sykkel newSykkel;
        newSykkel = new Sykkel (farge, type, pris, maxGear);
        addSykkel(newSykkel);
    }
    
    /**
     * Skrive ut oversikt over syklene i butikken.
     */
    public void printOversikt()
    {
        System.out.println("Alle sykler i " + butikkNavn + ":");
        for(Sykkel sykkel : sykler) {
            sykkel.writeSykkel();
            System.out.println("=====================================");
        }
    }
    
    /**
     * Liste alle syklene med pris som er høyere enn spesifisert.
     */
    public void printSykkelDetailsByCost(int prisGrense)
    {
        System.out.println("Alle sykler i " + butikkNavn + 
        " som er dyrere enn " + prisGrense);
        for(Sykkel sykkel : sykler) {
            if (sykkel.getPris() >= prisGrense)
            {
            sykkel.writeSykkel();
            System.out.println ("=================================");
            }
        }
    }
}
