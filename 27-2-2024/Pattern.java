// column 
// 0 1 2 3 4 5     -> row
// * * * * * *     -> 0
// * * * * * *     -> 1
// * * * * * *     -> 2
// * * * * * *     -> 3
// * * * * * *     -> 4
// * * * * * *     -> 5



class Pattern{

    public static void main (String[] args){

        for(int i = 0 ; i < 6 ; i++){   //It is called outter loop it contains columns.

            for(int j = 0 ; j <6 ; j++){   //It is called iiner loop it conatains rows.

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}