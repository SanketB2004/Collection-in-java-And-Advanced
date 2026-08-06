import java.util.*;

public class tstcollectionclass117 {
    public static void main(String[] args) {
        
        List<Integer>numList = new ArrayList<>();

        numList.add(15);
        numList.add(52);
        numList.add(51);
        numList.add(25);
        numList.add(58);

        Utility.printc(numList);

        Collections.sort(numList);
        System.out.print("Sorted Array : ");
        Utility.printc(numList);
        List<Integer> unmodifyble = Collections.unmodifiableList(numList);
    }
}
