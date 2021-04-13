package labs;

import java.util.Comparator;

public class Person {

    private String name;
    private int age;
    private String publicPhoneNum;
    private String privatePhoneNum;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPublicPhoneNum() {
        return publicPhoneNum;
    }

    public void setPublicPhoneNum(String publicPhoneNum) {
        this.publicPhoneNum = publicPhoneNum;
    }

    public String getPrivatePhoneNum() {
        return privatePhoneNum;
    }

    public void setPrivatePhoneNum(String privatePhoneNum) {
        this.privatePhoneNum = privatePhoneNum;
    }

    public void configurePhoneNums(String privatePhoneNum) {
        setPrivatePhoneNum(privatePhoneNum);
    }

    public void configurePhoneNums(String privatePhoneNum, String publicPhoneNum) {
        setPrivatePhoneNum(privatePhoneNum);
        setPublicPhoneNum(publicPhoneNum);
    }

    @Override
    public String toString() {
        return String.format("%s | %d| call %s", getName(), getAge(), getPrivatePhoneNum());
    }


    public static Comparator<Person> getNewComparator(boolean reverseOrder){

        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1 == null || o2 == null){
                    return -1;
                }
                int reverseOrderInt = reverseOrder? -1 : 1;
                return o1.getName().compareTo(o2.getName())*reverseOrderInt;
            }

        };

    }

    public static class staticComparator implements Comparator<Person>{
        boolean reverseOrder;

        public staticComparator(){
            this.reverseOrder = false;
        }

        public staticComparator(boolean reverseOrder){
            this.reverseOrder = reverseOrder;
        }

        @Override
        public int compare(Person o1, Person o2) {
            if(o1 == null || o2 == null){
                return -1;
            }
            int reverseOrderInt = reverseOrder? -1 : 1;
            return o1.getName().compareTo(o2.getName())*reverseOrderInt;
        }
    }

}
