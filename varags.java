public class varags {
    public static void main(String[] args) {
        
        System.out.println(sum(5,  5));

    }
    // public static int sum( int... a)
   public static int sum( int first , int second,int... a) {

        int sum = first+second ;
        for (int i : a) {
            sum+=i ; 
        }
        return sum;
    }
}
