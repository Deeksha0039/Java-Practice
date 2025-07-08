import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class MyMap {
    public static void main(String args[]) {
        Map<String,Integer> myMap=new HashMap<>();
        {
            myMap.put("Watermelon",10);
            myMap.put("Apple",20);
            myMap.put("Kiwi",30);
            myMap.put("Mango",40);
            myMap.put("Watermelon",50);

            System.out.println("Number of watermelons are : " + myMap.get("Watermelon"));
            System.out.println("Number of apples are : " + myMap.get("Apple"));
            System.out.println("Number of kiwi are : " + myMap.get("Kiwi"));
            System.out.println("Number of mangoes are : " + myMap.get("Mango"));

           for(Map.Entry<String,Integer>entry:myMap.entrySet())
           System.out.println("Key : " + entry.getKey()  +  " and " +  " Value : "  +  entry.getValue());
                
            }
        }
    }

