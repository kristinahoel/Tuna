public class Main {
    public static void main(String[] args) {
        try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); 
        //error fordi myNumbers[10] ikke eksisterer.
    }   catch (Exception e) {
        System.out.println("Noe gikk galt.");
    }
    }
}