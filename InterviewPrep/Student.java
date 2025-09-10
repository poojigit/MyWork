package InterviewPrep;

public class Student {

    String name;
    int age;

    Student(String n, int a){
        name=n;
        age=a;
    }

    void display(){
        System.out.println("Name: " +name+ "\nAge: " +age);
    }

    public static void main(String[] args) {
        Student s1=new Student("Apoorv Raj", 25);
        s1.display();
    }
}
