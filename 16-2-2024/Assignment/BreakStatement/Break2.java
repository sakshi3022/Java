class Break2{

    public static void main (String[] args){

        int a = 1;
        for(; a<10 ; a++){
            if(a == 5){
                break;
            }
            System.out.println(a*2);
        }
    }
}