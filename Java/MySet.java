import java.util.*;

class MySet {
    public static void main(String args[]) {
        Set<String> myset = new HashSet<>();
        {
            myset.add("Watermelon");
            myset.add("Apple");
            myset.add("Kiwi");
            myset.add("Watermelon");
            myset.add("Watermelon");
            myset.remove("Watermelon");

            for (String fruit : myset) {
                System.out.println(myset);
            }
        }
    }
}
