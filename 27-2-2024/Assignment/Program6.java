class Program6 {

    public static void main (String[] args){

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < i /2 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

//output         //logic
//               i/2 -> 0/2 = 0
//               i/2 -> 1/2 = 0
//  *            i/2 -> 2/2 = 1
//  *            i/2 -> 3/2 = 1
//  *  *         i/2 -> 4/2 = 2
//  *  *         i/2 -> 5/2 = 2
