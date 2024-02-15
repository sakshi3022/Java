class BooleanP2{

    public static void main (String[] args){
      
        int a = 10;
        int b = 23;
        System.out.println((a < b) || (a != b)); // both true = true
        System.out.println((a < b) || (a > b));  // true false = true
        System.out.println((a > b) || (a != b)); //false true = true
        System.out.println((a ==b) || (a >b));   //false false = false
    }
}