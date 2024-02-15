class Program2{

    public static void main (String[] args){

        int a = 11;  //the value of a is 13 bcz two time og increment.
        int b = 22;   //the value of a is 24 bcz two time og increment.

        int c ;

        c = a +  b +      a++           +   b++             +   ++a             +    ++b;
        //  11+ 22 + 11(a = 12 , b= 22) + 22(a = 12, b= 23) + 13(a= 13, b = 23) + 24(a = 13, b = 24)
         
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}