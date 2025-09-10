package InterviewPrep.Constructor;

public class Employee extends Person{
    Employee(){
        super(); //calls the parent constructor
        System.out.println("Child constructor called");
    }
}
