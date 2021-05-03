
/**
 * Model the operation of a heater, with a temperature.
 *
 * @author Kristina Hoel
 * @version 0.1
 */
public class Heater
{
    // The current temperature.
    private double temperature;
    
    /**
     * Create a Heater object, with initial temperature of 15 degrees.
     */
    public Heater()
    {
        this.temperature = 15.0;
    }
  
    /**
     * Increase the temperature by 5 degrees.
     */
    public void warmer()
    
    {
        temperature += 5.0;
        if(temperature > 30)
        {System.out.println("Ooops");}
        else{System.out.println("Alt ok");}
        
    }
    
    
    /**
     * Decrease the temperature by 5 degrees.
     */
    public void cooler()
    {
        temperature -= 5.0;
    }
}
