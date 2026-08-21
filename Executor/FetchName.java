package Executor;

import java.util.concurrent.Callable;

/**
 * Main
 */
public class FetchName implements Callable<String> {

    private final String name;

    public FetchName(String name){
        this.name=name;

    }

    @Override 
    public String call() throws Exception{
        Thread.sleep(4000);
        return name + " Hindu";
    }
    
    }
