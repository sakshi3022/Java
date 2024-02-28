//Sum program 


class Question6{

    public static void main (String[] args){

        int n= 10;
        int first = 0;
        int second = 1;
        int  next;
        int sum = 0;

        for(int i = 0 ; i <n ; i++){
            next = first + second;
            sum = sum + first;  
            System.out.println(first + "");
            first = second;
            second = next;


        }
        System.out.println("The sum of the first " + n + " numbers in the Fibonacci series is: " + sum);

    }
}