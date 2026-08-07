package challenges;
import java.util.*;
public class cha95 {
    public static void main(String[] args) {
        
        Set<Character> uniq = new HashSet<>();
        String userstr = "Hi Sanket Dandesh Zhopala ahe";

        for (Character character : userstr.toCharArray() ) {
            
            uniq.add(character);
        }
        System.out.println("Unique character in your string : "+ uniq.size());
    }
}
