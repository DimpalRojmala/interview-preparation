package leetcode;

import java.lang.reflect.Array;

public class CustomQueueWithArray<T> {


    int i=0;
    T[] myArray;
    int front=0;
    int noOfitems=0;
    CustomQueueWithArray(int size, Class<T> classRef)
    {

        myArray = (T[]) Array.newInstance(classRef,size);

    }

    public T get()
    {
        front++;
        T t = myArray[front];
        noOfitems--;
        return t;
    }

    public void put(T t)
    {
        i++;
        myArray[i]=t;
        noOfitems++;

    }

    public boolean isEmpty()
    {
        return noOfitems == 0;
    }


    public static <T> void main(String[] args)
    {
        CustomQueueWithArray customQueueWithArray = new CustomQueueWithArray<>(5,Integer.class);
        customQueueWithArray.put(10);
        customQueueWithArray.put(20);
        customQueueWithArray.put(30);
        customQueueWithArray.put(40);

        customQueueWithArray.get();
        customQueueWithArray.get();


        while (!customQueueWithArray.isEmpty())
        {
            T element = (T) customQueueWithArray.get();
            System.out.print(element + " "); // 30 40
            
        }

    }
}
