package java8.concept;

import java8.bean.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);
        
        
        //sort map by value
        
        map.entrySet().stream().sorted((o1,o2)-> o1.getValue().compareTo(o2.getValue())).forEach(t-> System.out.println("t = " + t));
        System.out.println("------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t-> System.out.println("t = " + t));
        System.out.println("------");
        //Reverse Order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(t-> System.out.println("t = " + t));


        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2)->o1.getId()-(o2.getId()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

        employeeMap.entrySet().stream().sorted((o1,o2)->o1.getKey().getId()-(o2.getKey().getId())).forEach((key)-> System.out.println("key = " + key));
        System.out.println("------");
        employeeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue()-(o1.getValue())).forEach(System.out::println); //Reverse based on value
        System.out.println("------");
        //Reverse on Key
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
        //Reverse on val
        System.out.println("Reverse on val");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
       //employeeMap.forEach((key,val)-> System.out.println("key = " + key));
    }
}
