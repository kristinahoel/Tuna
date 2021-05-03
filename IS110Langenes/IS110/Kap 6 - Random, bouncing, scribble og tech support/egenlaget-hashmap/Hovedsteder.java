import java.util.HashMap;

public class Hovedsteder {
  public static void main(String[] args) {
    // Lager et HashMap-objekt kalt capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Adder keys og values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}