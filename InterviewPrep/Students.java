package InterviewPrep;

public class Students {

    private String name;
    private int age;

    public void setName(String n){
        name=n;
    }

    public void setAge(int a){
        age=a;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Students s1= new Students();
        s1.setName("Apoorv Raj");
        s1.setAge(27);
        System.out.println("Name: " +s1.getName());
        System.out.println("Age: " +s1.getAge());

        Students s2=new Students();
        s2.setName("Poojisha Lakshya");
        s2.setAge(25);
        System.out.println("Name: " +s2.getName());
        System.out.println("Age: " +s2.getAge());
    }

}
