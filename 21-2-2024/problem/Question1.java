// Q. Write a program to check whether a number is positive or negative.


import java.util.Scanner;
class Question1{

    public static void main (String[] args){
         
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the number : ");
        int i= input.nextInt();

        if (i >=0){
            System.out.println(i +" is positive number");
        }else{
            System.out.println(i +" is negative number");
        }
    }
}