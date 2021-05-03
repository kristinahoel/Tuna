
class Katt extends Dyr
{
    private String kattemat;

    /**
     * Constructor.
     */
    public Katt(String navn, int alder, String kattemat)
    {
        super(navn, alder);
        this.kattemat = kattemat;
    }

    /**
     * Getter.
     */
    public String getKattemat()
    {
        return kattemat;
    }
    
     /**
     * Returner en stringrepresentasjon av dette objektet.
     */
    public String toString()    // redefinert fra "Dyr"
    {
        return super.toString() +
               "Kattemat: " + kattemat;
    }
    
    
}
