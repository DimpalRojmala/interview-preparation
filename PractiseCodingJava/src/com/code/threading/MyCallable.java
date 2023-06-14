package com.code.threading;

import java.util.concurrent.*;

public  class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return 1;
    }



    public static void main(String[] args) throws Exception{
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<Integer> f = exec.submit(new MyCallable());
        CompletableFuture cf = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Runn");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

       // System.out.println(f.isDone()); //False

       // System.out.println(f.get()); //Waits until the task is done, then prints 1
        System.out.println(cf.);
        System.out.println("main...");
    }
}