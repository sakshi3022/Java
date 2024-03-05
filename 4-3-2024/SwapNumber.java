class SwapNumber {
   
    public static void main (String[] args){

        //Method -1 
        int p = 12;
        int q = 23;
        int temp = p;
        p = q;
        q = temp;
        System.out.println( "Swapped value of p :" + p);
        System.out.println("Swapped value of q : " +q);


        //Method - 2
        int a= 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b ;

        System.out.println("Swapped value of a :" +a);
        System.out.println("Swapped value of b :" +b);

        //Method - 3
        int x = 90;
        int y = 23;

        x = x * y;
        y = x / y;
        x = x/ y;
        System.out.println("Swapped value of x :" +x);
        System.out.println("Swapped value of y :" +y);


    }
}
