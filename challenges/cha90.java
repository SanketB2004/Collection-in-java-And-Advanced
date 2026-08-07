package challenges;
import java.util.*;
// Write a program that sorts a list od string objects in desending order using a custome comparator .

public class cha90 {

    public static void main(String[] args) {
       
List<String> list = Arrays.asList("Bear","Zebra", "Lion", "Dog");

System.out.println(list);// real string

sortindecending(list);

System.out.println(list);// orignal string



    }

    public static void sortindecending(List<String> stringList ){
Collections.sort(stringList);
Collections.reverse(stringList);



    }
    
}
