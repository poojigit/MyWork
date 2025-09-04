package DataStructure.Array;

import java.util.HashSet;

public class HashPrac {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(27);
        set.add(10); //duplicates are ignored automatically
        System.out.println(set);
    }
}
