class NastedIf4{

    public static void main (String[] args){

        int a = 90;
        int b = 34;
        a += b;

        if (a >100){
            System.out.println("A is greter than 100");
        if (b >60){
            System.out.println("B is greter than 60");
        }
        else {
            System.out.println("The number is less than 60");
        }
        }
        else{
            System.out.println("The number is less than 100");
        }

    }
}