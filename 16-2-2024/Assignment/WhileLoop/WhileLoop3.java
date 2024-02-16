class WhileLoop3{

    public static void main(String[] args){

        byte p = 1;
        while(p <=127){
            p++;
            if (p > 5){
                break;
            }
            System.out.println(p);
        }
    }
}