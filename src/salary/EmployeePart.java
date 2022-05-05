package salary;
public class EmployeePart extends Employee {
    private float money;
    public EmployeePart(float salary,float money){
        super(money);
        this.money=money;
    }
    @Override
    public float getSalary(){
        return 300*money;
    }

    @Override
    public String toString() {
        return "EmployeePart{" +
                "money=" + money +
                "salary="+super.toString()+
                '}';
    }
}
