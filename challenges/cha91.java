package challenges;

import java.util.*;
// frequency count means to number kiti times ahe list madhe
public class cha91 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                1,2,3,4,5,8,7,2,1,5,2,5,8,52,2,5
        );

        System.out.println(Collections.frequency(list, 5));
    }
}