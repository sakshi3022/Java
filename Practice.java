import java.util.Scanner;


class Practice{

    public static void main (String[] args){

           System.out.println("Fill the form");

           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your Name: ");
           String name = input.next();

           System.out.println("Enter Your Address : ");
           String address = input.next();

           System.out.println("Enter Your Number: "); 
           int number = input.nextInt();

           System.out.println("Enter Your Age: "); 
           int age = input.nextInt();

           System.out.println("Enter Your Gender: ");
           String gender = input.next();
       
        
    }
}