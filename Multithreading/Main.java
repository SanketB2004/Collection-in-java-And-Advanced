class Star extends Thread {

    Star() {
        // Constructor
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }
    }
}

class Hash extends Thread {

    Hash() {
        // Constructor
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("#");
        }
    }
}

class Dollar extends Thread {

    Dollar() {
        // Constructor
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("$");
        }
    }
}

public class Main {
public static void main(String[] args) throws InterruptedException {

    Star t1 = new Star();
    Hash t2 = new Hash();
    Dollar t3 = new Dollar();

    t1.setPriority(10);
    t2.setPriority(5);
    t3.setPriority(1);

    System.out.println("Star Priority: " + t1.getPriority());
    System.out.println("Hash Priority: " + t2.getPriority());
    System.out.println("Dollar Priority: " + t3.getPriority());

    t1.start();
    t2.start();

    t1.join();

    t3.start();
}
}