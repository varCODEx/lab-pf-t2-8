package labs;

public class Employee extends Person{

    private String department;


    public Employee(String name, int age, String department){
        super(name, age);
        this.setDepartment(department);
    }

    public Employee(String name, int age){
        this(name, age, "Unknown Department");
    }


    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%s from %s| call %s", getName(), department, getPrivatePhoneNum());
    }
}
