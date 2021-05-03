
/**
 * Write a description of class Bakbrems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bakbrems
{
    //Bakbrems
    private int styrkeNaa;
    private int maxStyrke;
    private String type;
    private String sisteService;

    /**
     * Lage brems. Legge til defaultverdien når man ikke har param...!
     */
    public Bakbrems(int styrkeNaa, int maxStyrke, String type, String 
    sisteService){
        this.styrkeNaa = styrkeNaa;
        this.maxStyrke = maxStyrke;
        this.type = type;
        this.sisteService = sisteService;
    }

}
