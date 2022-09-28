import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class Employee {
    String name;
    int age;
    String designation;

    public Employee(String name, int age, String designation)
    {
        this.name= name;
        this.age= age;
        this.designation= designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Employee e1= new Employee("Ramesh Mishra",32,"Senior Software Developer");
        Employee e2= new Employee("Dharmesh Sharma",27,"Software Developer");
        Employee e3= new Employee("Kailash Dubey",37,"Testing Engineer");
        Employee e4= new Employee("Vishal Sharma",28,"ML Engineer");
        Employee e5= new Employee("Dharmesh Sharma",27,"Software Developer");

        Map<Employee,Integer> mp= new HashMap<>();
        mp.put(e1,90000);
        mp.put(e2,60000);
        mp.put(e3,55000);
        mp.put(e4,50000);
        mp.put(e5,30000);

        for(Employee key:mp.keySet())
        {
            System.out.println(key+":"+mp.get(key));
        }
    }
}
