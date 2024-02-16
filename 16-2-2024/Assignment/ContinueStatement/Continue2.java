class Continue2{

    public static void main (String[] args){
        float a = 1.5f;
        for(; a <=5;a++){
            if(a == 3.5){
                continue;
            }
            System.out.println(a);
        }
    }
}