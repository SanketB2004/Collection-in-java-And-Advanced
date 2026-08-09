package challenges;

public class cha97 {

    enum Day {
        Mon(true),
        Tue(true),
        Wed(true),
        Thu(true),
        Fri(true),
        Sat(false),
        Sun(false);
        
        private final boolean isWeekday;

        Day(boolean isWeekday){
            this.isWeekday=isWeekday;
        }
        
        public String getType(){
            return isWeekday ? "Weekday":"Weekend";
        }

    }

    public static void main(String[] args) {

        for (Day day: Day.values()) {
            System.out.printf("%s  : %s\n", day,day.getType());
        }
    }
}