class Program4{

    public static void main (String [] args){

        boolean a = flase;
        double  o = 526688;

        System.out.println(a + o);

       boolean a = flase;


//                     ^
//   symbol:   variable flase
//   location: class Program4
// Program4.java:8: error: bad operand types for binary operator '+'
//         System.out.println(a + o);
//                              ^
//   first type:  boolean
//   second type: double
// 2 errors
//     


}
}