package MyBasicLearning.Encapsulation;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<1 || age>100){
            System.out.println("Invalid age: " +age);
            return; //ignore invalid
        }
        this.age=age;
    }
}
