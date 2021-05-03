import java.util.Random;
/**
 * Vise klassen Random
 *
 * @author Kristina Hoel
 * @version 1.0
 */
public class Tallgenerator
{

    /**
     * Constructor for objects of class Tallgenerator
     */
    public Tallgenerator()
    {
        Random randomGenerator;
        randomGenerator = new Random();
        int index = randomGenerator.nextInt(100);
        System.out.println(index);
    }

    /**
     * Lage metode som kan øke det printede tallet med 1
     */
    public int økeMetode(); 
    {
        
    }

}
