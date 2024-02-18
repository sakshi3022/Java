import java.util.Scanner;
class Question2 {

    public static void main (String[] args){
          

        // char name ='A';

        Scanner input = new Scanner(System.in);
        System.out.println("ENter the value : " );
        char name = input.next().charAt(0);


         char encrypted =(char) (name + 8);
         char decrypted = (char) (name - 8);



        // System.out.println("This is value of A in int :" +(int) name);
        //System.out.println("This is value of encrypted in int :" +(int) encrypted);
        //System.out.println("This is value of decrypted in int :" +(int) decrypted);
        
        // System.out.println(name);
        System.out.println( encrypted);
        System.out.println( decrypted);



    }
}