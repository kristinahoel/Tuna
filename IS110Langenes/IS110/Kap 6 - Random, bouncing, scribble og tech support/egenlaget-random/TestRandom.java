import java.util.Random;
  
public class TestRandom
{ 
    public static void main(String args[])
    {
        // Lag instans fra Random-klassen
        Random rand = new Random();
  
        // Generer random integer mellom 0 og 999
        // Metoden nextInt generer et tilfeldig heltall og har et parameter
        // for å spesifisere spekteret vi vil bruke.
        int randomInt = rand.nextInt(1000);
  
        // Print random integer
        System.out.println("Random integer: "+ randomInt);
    }
}