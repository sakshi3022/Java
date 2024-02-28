
// 0 1 2 3 4 5 -> i value
// *            -> i= 0 -> i + 1 =0 + 1
// * *          -> i= 1 -> i + 1 =1 + 1
// * * *        -> i= 2 -> i + 1 =2 + 1
// * * * *      -> i= 3 -> i + 1 =3 + 1
// * * * * *    -> i= 4 -> i + 1 =4 + 1
// * * * * * *  -> i= 5 -> i + 1 =5 + 1

class Pattern1{

    public static void main (String[] args){

        for (int i = 0; i < 6 ; i++){

            for(int j =0 ; j < i + 1 ; j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}