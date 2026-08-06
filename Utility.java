import java.util.Collection;

public class Utility {
    
    public static void printc(Collection Collection){

        for (Object object : Collection) {
            System.out.printf("%s ",object);
        }
        System.out.println();
    }
}
