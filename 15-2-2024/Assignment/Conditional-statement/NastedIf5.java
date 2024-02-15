class NastedIf5{

    public static void main (String[] args){

        int a = 50;
        int b = 7;
        a += b;
        b /= a;

        if (a >35){ 

            System.out.println("A is addition greter than 50");

        if (b >60){

            System.out.println("B is division greter than a");
        }
        else {

            System.out.println("The number division is less than b");
        }
        }

        else{
            System.out.println("The number addition is less than 50");
        }

    }
}