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

    public static void main(String[] args) {

        Star t1 = new Star();
        Hash t2 = new Hash();
        Dollar t3 = new Dollar();

        t1.start();
        t2.start();
        t3.start();
    }
}