    //  *********
    //   *     *
    //    *   *
    //     * *
    //      *

class Program14{

    public static void main(String[] args){

         int n = 5;

            for(int i =0 ; i < n; i++){

                for(int j = 0; j < n - i - 1; j++){
                    System.out.print(" ");
                }

                for(int j = 0; j <= i * 2; j++){
                    if(j == 4 || i == 0 || j == i*2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
      
    }
}