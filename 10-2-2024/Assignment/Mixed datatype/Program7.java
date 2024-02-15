class Program7 {

    public static void main (String[] args){

        char name = 'r';
        boolean demo = true;

        System.out.println(name  + demo);

// Program7.java:8: error: bad operand types for binary operator '+'
//         System.out.println(name  + demo);
//                                  ^
//   first type:  char
//   second type: boolean
// 1 error
    }
}