
import java.util.*;
public class TestingSet {
    public static void main(String[] args) {
        
      Set<String> set = new HashSet<>(); 

      System.out.println(set.add("Sanket"));
      System.out.println(set.add("Bhosale"));
      System.out.println(set.add("Raje"));
      
      System.out.println(set.add("Bhosale"));// Uniqe values only not dublicate values allowed 

    //   System.out.println(set); // not a sireal tyacya manavr ahe kase element show karayache te 

      Utility.printc(set); //use utility class to prin metho
System.out.println(set.size()); // dublicate bhosale add kela tari pn tyane dublicate element add nay kela 
// karan allowed ny set madhe dublicate element
    }
}
