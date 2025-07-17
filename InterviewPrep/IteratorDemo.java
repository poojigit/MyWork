package InterviewPrep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class FruitList {
    private List<String> fruits;

    public FruitList() {
        fruits = new ArrayList<>();
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public Iterator<String> getIterator() {
        return fruits.iterator();
    }

    public void printFruits() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

public class IteratorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitList fruitList = new FruitList();

        System.out.println("How many fruits do you want to enter?");
        int n = sc.nextInt();
        sc.nextLine(); // buffer clear

        // 🔁 User se fruits input
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter fruit " + i + ": ");
            String fruit = sc.nextLine();
            fruitList.addFruit(fruit);
        }

        System.out.println("\n🍇 Fruits you entered:");
        fruitList.printFruits();

        System.out.println("\n🚨 Now attempting to call remove() twice without calling next() again");

        Iterator<String> itr = fruitList.getIterator();

        if (itr.hasNext()) {
            String fruit = itr.next();
            System.out.println("Next called. Got: " + fruit);

            itr.remove(); // ✅ First remove() - valid
            System.out.println("First remove() called successfully.");

            fruit = itr.next();
            System.out.println("Next called. Got: " + fruit);
            itr.remove();
            System.out.println("Second remove() called successfully.");
        }

        sc.close();
    }
}
