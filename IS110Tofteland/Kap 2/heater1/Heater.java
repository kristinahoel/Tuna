
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // Nåverende temp.
    public double temperature;

    /**
     * Nåværende temp
     */
    public Heater()
    {
        this.temperature = 15;
    }

    /**
     * Øke tempen 5 grader
     */
    public void warmer()
    {
        temperature += 5;
    }
    
    /**
     * Øke tempen 5 grader
     */
    public void cooler()
    {
        temperature -= 5;
    }
}
