// Q. Write a Java program to implement a simple calculator that takes two numbers and an operator (+, -, *, /) 
//as input from the user and performs the corresponding operation using a switch case statement.

import java.util.Scanner;
class Switch1{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("ENter the operator : ");
        char operator = input.next().charAt(0);

        System.out.println("ENter the a value : ");
        int a = input.nextInt();

        System.out.println("ENter the b value : ");
        int b = input.nextInt();

        switch(operator){
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
                System.out.println("Please enter valid operator");
        }


    }



}