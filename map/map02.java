package map;
import java.util.*;
/**
 * map02
 */
public class map02 {

    public static void main(String[] args) {
        
        Map<String , Long> map = new HashMap<>();
        
        
       map.put("Sanket", 7875640607L);
       map.put("KaKa"  , 9322955586L);
       map.put("Aai"   , 7756090020L);
       map.put("Atharv", 9860810865L);
       map.put("All In One No", 9322955586L);

System.out.println(map.size());
System.out.println(map.get("Sanket"));
System.out.println(map.containsKey("Aai"));
System.out.println(map.containsKey("Don"));
System.out.println(map.size());
System.out.println(map.remove("All In One No"));
System.out.println(map.size());

// all key print in one answer 

for (String string : map.keySet()) {
    
    System.out.println(string);
}


       


    }
    
}