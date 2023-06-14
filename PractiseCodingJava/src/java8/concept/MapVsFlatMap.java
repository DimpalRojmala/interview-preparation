package java8.concept;

import java8.bean.Customer;
import java8.bean.Employee;
import java8.dao.EkartDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();
        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
      List<String> emails =  customers.
              stream().map(customer -> customer.getEmail())
              .collect(Collectors.toList());
        System.out.println(emails);
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customers.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

       List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toMap(Collectors.groupingBy(Employee::getDept)));
        System.out.println(phones);



    }
}
