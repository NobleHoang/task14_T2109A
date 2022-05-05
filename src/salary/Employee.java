package salary;
public class Employee {
    private float salary;
    public Employee(float salary){
        this.salary=salary;
    }
    public float getSalary() {
        System.err.println("erorr");
        return 0;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "money=" + salary +
                '}';
    }
}
