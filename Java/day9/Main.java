package day9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("Apple",10);
        myMap.put("Mango",20);
        myMap.put("Litchi",30);
        System.out.println("Number of apples : " + myMap.get("Apple"));
        System.out.println("Elements in the map: ");

        for(Map.Entry<String,Integer>entry:myMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        if(myMap.containsKey("Mango")){
            System.out.println("Mango is present in the map.");
        } else {
            System.out.println("Mango is not present in the map.");
        }
    }
}
