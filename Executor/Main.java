package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(3);

        FetchName a1 = new FetchName("Sanket Bhosale");
        FetchName a2 = new FetchName("Atharv Bhosale");
        FetchName a3 = new FetchName("Narayan Dande");
        FetchName a4 = new FetchName("Kartik Khetmalis");
        FetchName a5 = new FetchName("Harshad Bendre");

        Future<String> name1 = service.submit(a1);
        Future<String> name2 = service.submit(a2);
        Future<String> name3 = service.submit(a3);
        Future<String> name4 = service.submit(a4);
        Future<String> name5 = service.submit(a5);

        System.out.println(name1.get());
        System.out.println(name2.get());
        System.out.println(name3.get());
        System.out.println(name4.get());
        System.out.println(name5.get());

        service.shutdown();
    }
}