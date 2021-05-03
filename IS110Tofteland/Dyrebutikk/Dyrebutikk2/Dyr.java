/*
 * Klassen Dyr skal omhandle dyr av alle slag  
 */
 

/**
 *
 * @author hallgeir
 */
public abstract class Dyr implements IDyr {
    
    private String art;
    private String fdato;
    private int pris;

    public Dyr(String art, String fdato, int pris) {
        this.art = art;
        this.fdato = fdato;
        this.pris = pris;
    }

    public Dyr() {
    }
    
    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getFdato() {
        return fdato;
    }

    public void setFdato(String fdato) {
        this.fdato = fdato;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

   

    public void skrivDyr() {
    
        System.out.println("art : "+art);
        System.out.println("Fødselsdato : "+fdato);
        System.out.println("pris : "+pris);
    }
       
        
}
