// Q. Write a program to find largest number between 3 numbers
  
import java.util.Scanner;
class Question2{


    public static void main (String[] args){
     
    Scanner input = new Scanner (System.in);
    System.out.println("Enter the a value : ");
    int a = input.nextInt();

    System.out.println("Enter the b value : ");   
    int b =  input.nextInt();

    System.out.println("Enter the c value : ");
    int c =  input.nextInt();

    if(a > b && a > c){
        System.out.println("a is greter then b & c");
    }
    else if(b >a && b > c){
        System.out.println("b is greter then a & c");
    }
    else {
        System.out.println("C is greter than a & b");
    }

}}