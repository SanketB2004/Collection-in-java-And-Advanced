package challenges;

import java.util.*;

public class cha98 {

    public static void main(String[] args) {

        // Map used in this code
        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("Bharat", "Pune");
        countryMap.put("Rassia", "Marco");
        countryMap.put("Pakistan", "karachi");
        countryMap.put("Japan", "Nobita");
        countryMap.put("London", "California");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Country Name");

        String country = sc.next();

        if (countryMap.containsKey(country)) {
            System.out.println("Found Your Country " + countryMap.get(country));
        } else {
            System.out.println("Sorry Not Match");
        }

        sc.close();
    }
}