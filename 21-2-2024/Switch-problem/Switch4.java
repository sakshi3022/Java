// Q. Develop a Java program that displays a simple menu to the user with options (e.g., 1. Add, 2. Subtract, 3. Multiply, 4. Divide). 
// Based on the user's choice, perform the corresponding arithmetic operation using a switch case statement.

import java.util.Scanner;
class Switch4{

    public static void main (String[] args){

        int a = 10;
        int b = 34;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice : ");
        char user = input.next().charAt(0);

        switch(user){
             case '+':
                System.out.println( a + b);
                break;
            
            case '-':
                System.out.println( a- b);
                break;

            case '*':
                System.out.println( a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Please enter valid operation to perform");
        }
    }
}