import java.util.*;

public class TestingQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.offer(5);

        // Utility.printc(q);

        // System.out.println(q.peek());
        // System.out.println(q.element());

        System.out.println(q.remove());
        Utility.printc(q);
        Utility.printc(q);

        
    }
}