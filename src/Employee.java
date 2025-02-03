public class Employee extends Person{
    private String employeeId;
    private String supervisorId;
    public float salary;

    // Konstruktor


    public Employee(String ln, String fn, String employeeId, String supervisorId, float salary, int a) {
        super(ln, fn);
        this.employeeId = employeeId;
        this.supervisorId = supervisorId;
        this.salary = salary;
        super.age = a;
    }

    public Employee(){}

    public String getEmployeeId() {
        return employeeId;
    }

    public void printAll(){
        System.out.println("Mein Name ist "+fullName()+" und ich bin "+age+" Jahre alt.");
        System.out.println("Meine EmployeeID ist "+getEmployeeId()+".");
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
