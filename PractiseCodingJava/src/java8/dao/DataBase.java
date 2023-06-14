package java8.dao;

        import java8.bean.Employee;

        import java.util.ArrayList;
        import java.util.List;
//DAO layer
public class DataBase {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000,"A"));
        list.add(new Employee(388, "Bikash", "CIVIL", 900000,"B"));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000,"A"));
        list.add(new Employee(624, "Sourav", "CORE", 400000,"A"));
        list.add(new Employee(176, "Prakash", "SOCIAL", 1200000,"B"));
        return list;
    }

}
