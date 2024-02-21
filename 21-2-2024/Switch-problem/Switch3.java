// Q. Write a Java program that takes an integer representing a month number (1 for January, 2 for February, etc.) and
//  prints the corresponding month name using a switch case statement.

import java.util.Scanner;
class Switch3 {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int month = input.nextInt();

        switch(month){

            case 1:
                System.out.println("The month is January");
                break;
           case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is Octomber");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;

            default:
                System.out.println("Enter the number between 1 to 12");
            
        }
    }
}