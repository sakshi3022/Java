class Program12{

    public static void main (String[] args){

        int m=1010, n=1010;

        System.out.println(m++ / ++n * n-- / --m); 

        // (1011 / 1011) * (1011 / 1010)
        // 0 * 1 
        //0
        
    }
}