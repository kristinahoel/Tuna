import java.util.Random;

public class RandomNumbers
{
    public static void main(String[] args) 
    {
        Random gen = new Random();

        for(int i=0;i<10;i++) {
            int number = gen.nextInt(6)+1;
            System.out.println(number);
        }
    }
}