
/**
 * Write a description of class PatteDyr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class PatteDyr extends Dyr
{
     private int drektigTid; 
     private int antUnger;  

    /**
     * Constructor for objects of class PatteDyr
     */
    public PatteDyr(String art, String fdato, int pris, int drektigTid, int antUnger)
    {
         super(art,fdato,pris);
         this.drektigTid = drektigTid;
         this.antUnger = antUnger;
    }

    
    public int getDrektigTid()  {
        return drektigTid;
    }
    
    public int getAntUnger()  {
        return antUnger;
    }

    public void setDrektigTid(int drektigTid) throws IllegalArgumentException {
        if(drektigTid > 1000)
            throw new IllegalArgumentException("This is silly");
        this.drektigTid = drektigTid; 
    }
    

    public void setAntUnger(int antUnger) {
        this.antUnger = antUnger; 
    }

    public void skrivDyr() {
        super.skrivDyr();
        System.out.println("Drektig, antall uker: " +drektigTid);
        System.out.println("Antall unger, snitt : " +antUnger);
    
    }
    
}
