class Continue5{

    public static void main (String[] args){

        int x = 3;
        while (x <= 9)
        { x++;
            if (x == 5){
                continue;
            }
        System.out.println(x);
        }       
    }
}