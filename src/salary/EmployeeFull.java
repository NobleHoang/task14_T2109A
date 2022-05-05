package salary;
public class EmployeeFull extends Employee{
    private float money;
    public EmployeeFull(float salary,float money){
        super(money);
        this.money=money;
    }
    @Override
    public float getSalary(){
        return 300*money;
    }

    @Override
    public String toString() {
        return "EmployeeFull{" +
                "money=" + money +
                "salary="+super.toString()+
                '}';
    }
}
