public class EmployeeDriver {

    public static void main(String[] args) {
        //employee=e;
        Employee e1 = new Employee("Bob", 2000.00);
        Employee e2 = new Employee();
        e2.setName("Ogo");
        e2.setSalary(2500.00);
       
        double totalSalary = totalSalary(e1, e2);
        String higherSalary = higherSalary(e1, e2);
        System.out.println("\nThe highest salary is "+higherSalary);
        System.out.println("Total salary is "+totalSalary);
        
        System.out.println("The salary of employee before raise: " + e1.getSalary());
        e1.raiseSalary(8.0);
        System.out.println("The salary after raise: " + e1.getSalary());
        
    }

    public static String higherSalary(Employee e1, Employee e2) {
        if (e1.getSalary() >= e2.getSalary()) {
            return e1.getName();
        } else {
            return e2.getName();
        }
    }

    public static double totalSalary(Employee e1, Employee e2) {
        return (e1.getSalary() + e2.getSalary());
    }
}
