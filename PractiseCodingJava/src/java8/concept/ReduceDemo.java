package java8.concept;

import java8.bean.Employee;
import java8.dao.DataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        Integer reduceSum = numbers.stream().reduce(0,(a,b)->a+b);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

        Integer maxResult = numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("maxResult = " + maxResult);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxvalueWithMethodReference);

        String longestString = words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println("longestString = " + longestString);

        String concat = words.stream().reduce((word1,word2)->word1+"/"+word2).get();
        System.out.println("concat = " + concat);





        List<Employee>  employees = DataBase.getEmployees();

        List<Employee>  employeesFiltered = employees.stream()
                .filter(employee -> employee.getGrade().equals("A")).collect(Collectors.toList());

        long sum = employeesFiltered.stream().map(employee -> employee.getSalary()).reduce(Long::sum).get();
        System.out.println("sum = " + sum);

        double avgSal = employeesFiltered.stream().
                map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average()
                .getAsDouble();
        System.out.println("avgSal = " + avgSal);



               // .forEach(employee -> System.out.println("employee = " + employee));
    }
}
