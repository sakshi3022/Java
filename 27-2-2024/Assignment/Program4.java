class Program4{

    public static void main (String[] aegs){

        for(int i = 0; i < 6 ; i++){
            for(int j = 0; j < i - 2; j++){
                System.out.print("j ");
            }
            System.out.println();
        }
    }
}

//Output:
//
//
//
// j
// j j
// j j j

//Logic = 
//i- 2 = 0-2 = 0
//i- 2 = 1-2 = 0
//i- 2 = 2-2 = 0
//i- 2 = 3-2 = 1
//i- 2 = 4-2 = 2
//i- 2 = 5-2 = 3

//For the the first three lines are blank because of 0 and then print 1,2,3 "j"

