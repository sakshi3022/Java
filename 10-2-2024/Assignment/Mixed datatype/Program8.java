class Program8{

    public static void main(String[] args){

        int a      = 23;
        byte b     = 123;
        short c    = 34;
        long d     = 234456735;
        float e    = 123.45;
        double f   = 3455;
        char g     = 'f';
        boolean h  = true;

        System.out.println(a + b + c + d);
        System.out.println(a / g % g + d);
        System.out.println(a * h + b );
        System.out.println(a + h);
        System.out.println(d * g);

// Program8.java:9: error: incompatible types: possible lossy conversion from double to float
//         float e    = 123.45;
//                      ^
// Program8.java:16: error: bad operand types for binary operator '*'
//         System.out.println(a * h + b );
//                              ^
//   first type:  int
//   second type: boolean
// Program8.java:17: error: bad operand types for binary operator '+'
//         System.out.println(a + h);
//                              ^
//   first type:  int
//   second type: boolean
// 3 errors


    }
}