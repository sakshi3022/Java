import java.util.Random;
import java.util.Scanner;

class Game{

    public static void main (String[] args){
        
       
        //Step - 1 : Genrate random Number 
        Random random = new Random();
        int machineNumber = random.nextInt(1,10);
        System.out.println("Number generated by machine: " + machineNumber);

        
        
        //Step - 2 : Take input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 10: ");
        int userNumber = input.nextInt();
        System.out.println(userNumber);

        //step -3 : check the number is same as generated by machine 
        int count = 1;
        while (true) {
        if(machineNumber == userNumber){
            System.out.println("Congratulation !!!.. You gueesed the correct number in " + count + "");
            break;
        }

        //step - 4 : if user number is greter than the machine number
        else if (userNumber > machineNumber){
            System.out.println("Enter a smaller number ");
            userNumber = input.nextInt();
        }

        //step - 5 : if the user is smaller then the machine number
        else if (userNumber < machineNumber){
            System.out.println("Enter the greter number");
            userNumber = input.nextInt();
            count++;
        }

    }
    }
}