class Continue3{

    public static void main (String[] args){

        int a = 1;
        while(a < 7){
            a++;
            if (a == 5){
                continue;
            }
            
            System.out.println(a);
        }
    }
}