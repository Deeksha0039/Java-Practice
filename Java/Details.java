import java.util.Scanner;

    class Student{
        String name;
        long rollNo;
        
        void inputDetails(){
            Scanner sc=new Scanner(System.in);
        
            System.out.println( "Enter Your Name : ");
            name=sc.nextLine();


            System.out.println("Enter Your Roll_no : ");
            rollNo=sc.nextLong();

            sc.close();
        }

        void displayDetails(){
            System.out.println("MY NAME IS : "  +  name );
            
            System.out.println("MY ROLL NO IS : "  +  rollNo );
        }   
    }

public class Details extends Student {
    public static void main(String[] args) {
        Details d = new Details();
        d.inputDetails();             
        d.displayDetails();  
    }
}
