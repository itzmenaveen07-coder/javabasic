import java.util.*;
import java.util.stream.Collectors;

public class Employee
{
            private int id;
            private String name;
            private double salary;

            public Employee(int id, String name, double salary)
            {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }
            public double getSalary()
            {
                return salary;
            }
            public int getid()
            {
             return id;
            }
            @Override
            public String toString()
            {
                return "Employee{id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary + '}';
            }
            // ✅ ALL logic moved into a method
            public static void streamEmployee()
            {
                List<Employee> employees = new ArrayList<>();
                employees.add(new Employee(1, "Alice", 40000));
                employees.add(new Employee(2, "Bob", 55000));
                employees.add(new Employee(3, "Charlie", 70000));
                employees.add(new Employee(4, "David", 30000));

                double salaryLimit = 50000;
                List<Employee> highSalaryEmployees = employees.stream()
                                .filter(emp -> emp.getSalary() > salaryLimit)
                                .collect(Collectors.toList());
                double AverageSalary =employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
                OptionalDouble averageid =employees.stream().mapToInt(Employee::getid).average();
                OptionalInt maxid =employees.stream().mapToInt(Employee::getid).max();
                Optional<Double> thirdLargestSalary = employees.stream()
                        .map(Employee::getSalary)
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .skip(2)
                                .findFirst();
                System.out.println(thirdLargestSalary);
//                System.out.println(maxid);
//                System.out.println(AverageSalary);
//                highSalaryEmployees.forEach(System.out::println);
//                System.out.println(averageid);
            }
}
