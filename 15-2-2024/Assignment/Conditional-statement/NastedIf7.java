class NastedIf7{

    public static void main(String[] args){
        int a = 2;
        int b = 8;
        int c = 5;
 
        if (a == b) {
 
            if (a == c) {
                System.out.println("Equal");
            } else {
                
                System.out.println("Not equal");
            }
        } else {
            System.out.println("Not equal");
        }
    }
}