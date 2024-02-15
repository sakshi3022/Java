class OperatorP2{

    public static void main (String[] args){

        int a = 34;
        float b = 34.5f;
        long c = 78;

        System.out.println(a + b % c);
        System.out.println(b / c - a);
        System.out.println((a / b) - (b / c) - (a / c));
    }
}