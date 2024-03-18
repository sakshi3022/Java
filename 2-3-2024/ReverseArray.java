class ReverseArray{

    public static void main (String[] args){

        int [] arr = { 10 , 20 ,30 ,40, 50};
    
        //  isReverse(arr);
       System.out.println(isReverse(arr));
    }
       
    static int isReverse(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max = i;

            }
        }
    
    return max;

    }
}