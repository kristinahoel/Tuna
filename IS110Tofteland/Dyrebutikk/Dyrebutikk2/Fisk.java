
/**
 * Write a description of class PatteDyr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fisk extends Dyr
{
     private int dybde; 
     private int temp;  

    /**
     * Constructor for objects of class Fisk
     */
    public Fisk(String art, String fdato, int pris, int dybde, int temp)
    {
         super(art,fdato,pris);
         this.dybde = dybde;
         this.temp = temp;
    }

    
    public int getdybde()  {
        return dybde;
    }
    
    public int gettemp()  {
        return temp;
    }

    public void setdybde(int dybde) {
        this.dybde = dybde; 
    }
    

    public void settemp(int temp) {
        this.temp = temp; 
    }

    
    public void skrivDyr() {
        super.skrivDyr();
        System.out.println("Dybde fisken finnes: " +dybde);
        System.out.println("Vanntempratur fisken trives på : " +temp);
    
    }
    
}
