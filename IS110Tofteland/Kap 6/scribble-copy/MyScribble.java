
/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class MyScribble
{
    private Pen pen;

    /**
     * Constructor
     */
    public MyScribble()
    {
        pen = new Pen();
    }

    /**
     * Denne metoden kan tegne forskjellige figurer avhengig av verdien 
     * av en av dens lokale variabler. Tallet 3 gir trekant, 4 gir firkant etc.
     */
    public void drawPentagon (int length)
    {
        int sides = 3;
        int angle = 360/sides;
        for(int side = 0; side< sides; side++) {
            pen.move(length);
            pen.turn(angle);
        }
    }

    /**
     * Tegne en linje
     */
    public void drawLine() 
    {
        pen.move(50);
    }
}
