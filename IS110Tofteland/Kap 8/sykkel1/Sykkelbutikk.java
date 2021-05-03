import java.util.ArrayList;

/**
 * En sykkelbutikk som holder detaljer om syklene den selger.
 *
 * @author Kristina Hoel
 * @version 1.0 23.02.21
 */
public class Sykkelbutikk
{
    // Navnet til butikken
    private String butikkNavn;
    // En ArrayList for å lagre sykler
    private ArrayList<Sykkel> sykler;
    
    /**
     * Lage en Sykkelbutikk
     */
    public Sykkelbutikk()
    {
        this.butikkNavn = butikkNavn;
        sykler = new ArrayList<>();
    }

    /**
     * Legge til en eksisterene sykkel i lista vår.
     * @param   nySykkel
     */
    
    
    /**
     * Registrere ny sykkel i butikken.
     * @param  beskrivelse av sykkelen.
     */
    public void nySykkel(String farge, String type, int pris, Gir gir, int 
    hastighet, Forbrems forbrems, Bakbrems bakbrems)
    {
        sykler.add(new Sykkel(farge, type, pris, gir, hastighet, forbrems, 
        bakbrems));
    }
    
    /**
     * Skrive ut oversikt over syklene.
     */
    public void visSykler()
    {
        for(Sykkel sykkel : sykler) {
            System.out.println(sykkel.toString());
        }
    }
    
    /**
     * Skrive ut oversikt 2 (med for-each løkke. writeSykkel henviser 
     * til sykkelklassen
     */
    public void printOversikt()
    {
        System.out.println("Alle sykler i " + butikkNavn);
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
        System.out.println("Alle sykler i " + butikknavn + 
        " som er dyrere enn " + prisGrense);
    }
}
