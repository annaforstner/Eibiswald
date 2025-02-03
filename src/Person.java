public class Person {
    private String name;
    private String firstname;
    public int age;

    public Person(String ln, String fn) {
        this.name = ln;
        this.firstname = fn;
    }

    public Person(){
    }

    public void setName(String ln, String fn){
        this.name = ln;
        this.firstname = fn;
    }

    public String fullName(){
        String ganzerName = firstname+" "+name;
        return ganzerName;
    }
}
