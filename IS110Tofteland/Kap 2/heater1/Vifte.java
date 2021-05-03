
/**
 * Write a description of class Vifte here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vifte
{
    // Nåværende temp
    private double temperature;

    /**
     * Constructor for objects of class Vifte
     */
    public Vifte()
    {
        this.temperature = 15;
    }

    /**
     * Øke fem grader
     */
    public void varmere()
    {
        temperature += 5;
        if(temperature >= 30)
        {System.out.println("Brannfare");}
        else{System.out.println("OK");}
    }

    /**
     * Synke fem grader
     */
    public void kaldere()
    {
        temperature -= 5;
    }
}
