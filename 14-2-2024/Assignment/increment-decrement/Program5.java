class Program5{

    public static void main (String[] args){

         int i=1, j=2, k=3;
         
        int m = i-- - j-- - k--;
        //     (1) - (2) - (3) = -4
        System.out.println("i="+i);  // in i  we perform decrement so i value is 0.
        System.out.println("j="+j); // in i  we perform decrement so j value is 1.
        System.out.println("k="+k); // in i  we perform decrement so k value is 2.
        System.out.println("m="+m);
    }
}