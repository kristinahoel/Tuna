
/**
 * En enkel øvelse for å vise en vifte man kan skru opp og ned temperaturen
 * på. Temperaturen settes til 15 grader i constructoren og får metoder for
 * å øke og senke temperaturen med intervaller på 5 grader. 
 *
 * @author Kristina
 * @version 1.0
 */
public class Vifte
{
    private int temp;

    public Vifte()
    {
        this.temp = 15;
    }

    public void varmere()
    {
        temp += 5;
        if(temp >= 30)
        {System.out.println("Brannfare");}
        else
        {System.out.println("Alt ok");}
    }
    
    public void kaldere()
    {
        temp -= 5;
    }
    
    public void getTemp()
    {
        System.out.println("Temperaturen er " + temp + " grader");
    }
}
