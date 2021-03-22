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
    private String butikkAdresse;
    private ArrayList<Dyr> kolleksjonDyr;

    /**
     * Constructor.
     */
    public Dyrebutikk(String butikkNavn, String butikkAdresse)
    {
        this.butikkNavn = butikkNavn;
        this.butikkAdresse = butikkAdresse;
        kolleksjonDyr = new ArrayList<Dyr>();
    }

    /**
     * Legg til et eksisterende dyr i butikken.
     */
    public void addDyr(Dyr nyttDyr)
    {
        kolleksjonDyr.add (nyttDyr);
    }

    /**
     * Printe detaljer om alle dyr. Alle likhetstegnene er bare for pynt og 
     * printer skillelinjer.
     */
    public void skrivAlleDyr()
    {
        System.out.println("Alle dyr i " + butikkNavn +":");
        System.out.println("====================================");
        for(Dyr dyr : kolleksjonDyr)
            dyr.skrivDyr();
        System.out.println("====================================");
    }

    /**
     * Skriver ut alle pattedyr. Med for-løkke. Kunne og brukt for each.
     * Løkker består av tre ting: må initialiseres, må ha betingelse og noe som påvirker betingelsen.
     */
    public void skrivAllePatteDyr()
    {
        int index;
        Dyr dyr;
        for (index = 0; index < kolleksjonDyr.size(); index++)
        {
            dyr = kolleksjonDyr.get(index);
            if(dyr instanceof PatteDyr) //sjekker at den peker på pattedyr før vi skriver ut
                dyr.skrivDyr();
        }
    }

    /**
     * Printe med while-løkke for moroskyld. Da må vi selv sørge for at vi 
     * begynner på 0 og slutter når vi er ferdig. Merk at parameteret oppgis
     * av kunden når vi kaller metoden.
     */
    public void skrivAlleDyrDyrereEnn(int prisGrense)
    {
        int index = 0;
        Dyr dyr;
        while(index < kolleksjonDyr.size()) {
            dyr = kolleksjonDyr.get(index);
            if (dyr.getPris() >= prisGrense)
                dyr.skrivDyr();
            index++;
        }
    }   
}
