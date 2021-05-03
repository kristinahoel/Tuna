
/**
 * Write a description of class Fugl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fugl extends Dyr
{
     private int vingeSpenn; 
     private String farge;  

    /**
     * Constructor for objects of class Fugl
     */
    public Fugl(String art, String fdato, int pris, int vingeSpenn, String farge)
    {
         super(art,fdato,pris);
         this.vingeSpenn = vingeSpenn;
         this.farge = farge;
    }

    
    public int getvingeSpenn()  {
        return vingeSpenn;
    }
    
    public String getfarge()  {
        return farge;
    }

    public void setvingeSpenn(int vingeSpenn) {
        this.vingeSpenn = vingeSpenn; 
    }
    

    public void setfarge(String farge) {
        this.farge = farge; 
    }

    
    public  void skrivDyr() {
        super.skrivDyr();
        System.out.println("Vingespenn  : " +vingeSpenn);
        System.out.println("Farge       : " +farge);
    
    }
    
}
