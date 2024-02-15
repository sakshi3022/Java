class AssignmentP4{
    
    public static void main (String[] args){

        int a = 23;
        int b = 44;
        int c = 3456;
        int d = 90;
        float e = 4.4f;

        a += b;
        c -= b;
        d *= b;
        e /= b;
        b %= a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}