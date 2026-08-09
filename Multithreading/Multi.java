/**
 * Multi
 */
public class Multi {

     public static void main(String[] args) {
      /////////////////////////1
      /// 
      // 
      long startTime =System.currentTimeMillis();
        for (int i = 1 ; i <1000 ; i++) {
            System.out.print(i+" ");

        }

        System.out.println("1st task complete");
 /////////////////////////2
 for (int i = 1 ; i <1000 ; i++) {
            System.out.print(i+" ");

        }

System.out.println("2nd task complete");

 /////////////////////////3
 for (int i = 1 ; i <1000 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("3rd task complete");


         /////////////////////////4
         for (int i = 1 ; i <1000 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("4th task complete");
        

        long endTime =System.currentTimeMillis();

        System.out.printf("Total time taken : %d",(endTime-startTime));
    }
    


}