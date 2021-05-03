import java.util.HashMap;

public class Kontaktliste
{
    public static void main(String[] args) {
        //Lager en tomt HashMap
        HashMap<String, String> contacts = new HashMap<String, String>();
        
        //Mapper stringverdier til stringkeys
        contacts.put("Hallgeir", "12345678");
        contacts.put("Even", "23456789");
        contacts.put("Kristina", "34567891");
        
        //Viser HashMappet
        System.out.println("Kontaktlista inneholder: " + contacts);
        
        //Få Hallgeir sitt nummer
        System.out.println("Nummeret er: " + contacts.get("Hallgeir"));

    }
}