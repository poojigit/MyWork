package MyBasicLearning.Encapsulation;

public class Student {

    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student s = new Student("Poojisha", 22);
        System.out.println("Before: " + s.getName() + ", " + s.getAge());
        s.setAge(23);
        s.setName("Lakshya");
        System.out.println("After: " + s.getName() + ", " + s.getAge());
    }
}

