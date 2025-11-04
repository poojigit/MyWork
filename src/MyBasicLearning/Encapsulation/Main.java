package MyBasicLearning.Encapsulation;

public class Main {
    public static void main(String[] args) {
        /*Student s = new Student("Poojisha Lakshya",30);
        s.setAge(1000);
        System.out.println("Name is: " +s.getName()+ " and " + "age is: " +s.getAge());*/

        Employee e1 = new Employee(111,"Poojisha");
        System.out.println("Id is: " +e1.getId());
        System.out.println("Name is: " +e1.getName());
    }
}
