package java8;

import javax.sql.rowset.Predicate;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEvenPrint {

    private static Object object = new Object();
    static IntPredicate oddNumber = i->i%2!=0;
    static IntPredicate evenNumber = i-> i%2==0;

    public static void main(String[] args) throws InterruptedException {


        CompletableFuture.runAsync(()->OddEvenPrint.printNumber( oddNumber));
        CompletableFuture.runAsync(()->OddEvenPrint.printNumber( evenNumber));
        Thread.sleep(1000);

    }

    public static void printNumber(IntPredicate condition)
    {
        IntStream.rangeClosed(1,10)
                .filter(condition)
                .forEach(e->execute(e));
    }

    public static void execute(int n)  {
       // System.out.println(n);
        synchronized (object)
        {
            System.out.println(Thread.currentThread().getName()+" : "+ n );
            object.notify();
            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
