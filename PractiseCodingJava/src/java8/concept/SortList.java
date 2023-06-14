package java8.concept;

import java8.dao.DataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SortList {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,8,5);

        list.stream().sorted().forEach(t-> System.out.println("t = " + t)); //assending
        System.out.println("------");
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println("t = " + t)); //Dessending



        DataBase.getEmployees().stream().sorted(( o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(t-> System.out.println("t = " + t));

        DataBase.getEmployees().stream().sorted(Comparator.comparing(emp->emp.getName())).forEach(t-> System.out.println("t = " + t));

    }
}
