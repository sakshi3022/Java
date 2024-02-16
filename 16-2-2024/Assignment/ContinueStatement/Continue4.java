class Continue4{

    public static void main (String[] args){
        
        for(int x = 10; x < 20; x++){
            
            if (x == 12){
                continue;
            }
            System.out.println(x);
        }
    }
}