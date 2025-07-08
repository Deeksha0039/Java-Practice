import java.util.Queue;
import java.util.LinkedList;

class MyQueue {
    public static void main(String args[]) {
        Queue<String> myQueue = new LinkedList<>();
        {
            myQueue.offer("Watermelon");
            myQueue.offer("Apple");
            myQueue.offer("Kiwi");
            myQueue.offer("Mango");
            myQueue.offer("Watermelon");

            while (!myQueue.isEmpty()) {
                    System.out.println("Queue"  +  myQueue);
                    String removedElement = myQueue.poll();
                    System.out.println("Removed Element  "  +  removedElement);
                }

            System.out.println("Queue is now empty.");
                
            }
        }
    }

