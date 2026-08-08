package challenges;

public class cha96 {

    enum Days {
        Mon,
        Tue,
        Wed,
        Thu,
        Fri,
        Sat,
        Sun
    }

    public static void main(String[] args) {

        System.out.println("Printing all the days of the week");
        System.out.println(Days.Mon);

        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}