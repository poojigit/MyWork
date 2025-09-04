package DataStructure.Array;

import InterviewPrep.Constructor.Person;

import java.util.ArrayList;

public class ArrayPrac {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        //Add
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orages");


        //Remove
        //list.remove("Banana");

        //search
        if(list.contains("Apple")){
            System.out.println("Apple is present.");
        }

        //Iterate
        for(String s: list){
            System.out.println(s);
        }
    }
}
