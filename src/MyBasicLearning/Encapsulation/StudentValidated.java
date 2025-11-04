package MyBasicLearning.Encapsulation;

public class StudentValidated {
    private String name;
    private int age;

    public StudentValidated(String name, int age) {
        this.name = name;
        setAge(age);
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
        if (age < 1 || age > 100) {
            System.out.println("Invalid Age: " + age);
            return; // ignore invalid
        }
        this.age = age;
    }

    public static void main(String[] args) {
        StudentValidated s = new StudentValidated("Pooji", 25);
        s.setAge(150);
        s.setAge(28);
        System.out.println("Final Age: " + s.getAge());
    }
}

