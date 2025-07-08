package day9;

import java.util.Vector;

public class VectorDemo {
   public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Size of the vector: " + numbers.size());
        
        System.out.println("Elements in the vector:");
        for (Integer element : numbers) {
            System.out.println(element);
        }


        if (numbers.contains(20)) {
            System.out.println("20 is present in the vector.");
        } else {
            System.out.println("20 is not present in the vector.");
        }
    }
}
