class Program13{

    public static void main (String[] args){

         int x = 001, y=010, z=100;
         
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        
        // 0 + 10 – 100 – 98 + 12 – (-1) + 12 – (-2)

         
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
        
    }
}