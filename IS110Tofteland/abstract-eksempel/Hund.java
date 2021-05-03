
class Hund extends Dyr
{
    private String hundemat;

    /**
     * Constructor.
     */
    public Hund(String navn, int alder, String hundemat)
    {
        super(navn, alder);
        this.hundemat = hundemat;
    }

    /**
     * Getter.
     */
    public String getHundemat()
    {
        return hundemat;
    }
    
    /**
     * Returner en stringrepresentasjon av dette objektet.
     */
    public String toString()    // redefinert fra "Dyr"
    {
        return super.toString() +
               "Hundemat: " + hundemat;
    }
}