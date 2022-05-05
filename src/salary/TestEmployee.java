package salary;
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new EmployeeFull(20,100);
        System.out.println(e1);
        System.out.println("salary is : "+e1.getSalary());
        Employee e2 = new EmployeePart(200000,20000);
        System.out.println(e2);
        System.out.println("Salary is :"+e2.getSalary());

    }

}
