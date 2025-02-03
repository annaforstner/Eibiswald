public class Supervisor extends Employee{

    public Supervisor(String ln, String fn, String employeeId, String supervisorId, float salary, int a) {
        super(ln, fn, employeeId, supervisorId, salary, a);
    }

    private float salaryIncrease(){
        return salary * 1.02f;
    }


}
