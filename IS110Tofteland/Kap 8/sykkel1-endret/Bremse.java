/**
 * Klasse for bremser.
 * 
 * @author Kristina
 * @version 1.2
 */

public class Bremse
{
    private int styrke;
    private int maxStyrke;
    private String type;
    private String sisteService;

    /**
     * Constructor
     */
    public Bremse (int maxStyrke, String type)
    {
        this.maxStyrke = maxStyrke;
        this.type = type;
    }

    public void writeBrems()
    {
        System.out.println ("Bremsestyrke nå: " + styrke + ", av totalt " 
        + maxStyrke);
        System.out.println ("Type brems: " + type + ", " + "Sist service: " 
        + sisteService);
    }
}