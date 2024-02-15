class Program3{

    public static void main(String[] args){

        int i = 0;

        i = i++ - --i + ++i - i--;
     //( 0 - 0 + 1 - 1) = 0

    // 0 (before increment) -  
    // 0 ( after i incement i value is 1 then using decrement value is 0) 
    // + 1 ( the now i value is 0 we perform increment then value is 1)
    // -1  (the i value i we decrement is 1 )

        System.out.println(i);
    }
}