package challenges;
import java.util.*;
public class cha89 {
    public static void main(String[] args) {
        
        System.out.println(concanate("Sanket"));
        System.out.println(concanate("Bhosale"));

    }
    
       public static String concanate(String... str){

        StringBuilder sb = new StringBuilder();

        for (String string : str) {
            sb.append(string).append(" ");

        }return sb.toString();
       } 
    }

  