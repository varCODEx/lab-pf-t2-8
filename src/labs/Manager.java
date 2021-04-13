package labs;

public class Manager extends Employee{

    private String job;


    public Manager(String name, int age, String department, String job) {
        super(name, age, department);
        this.setJob(job);
    }


    public String getJob() {
        return job;
    }
    public void setJob(String title) {
        this.job = title;
    }

    @Override
    public String toString() {
        return String.format("%s from %s| should %s| call %s", getName(), getDepartment(), job, getPrivatePhoneNum());
    }

    @Override
    public String getPrivatePhoneNum() {
        return "##########"; // u shouldn't ask for manager's private number
    }
}
