class Program10{

    public static void main (String[] args){

        int a=1;
         
        a = a++ + ++a * --a - a--;
         // 1 +3 *2 -2 
         //  1+6 -2
         //  7-2
         //  5
        System.out.println(a);

        
    }
}