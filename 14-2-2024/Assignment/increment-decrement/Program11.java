class Program11{

    public static void main (String[] args){

         int a = 11++;
         
        System.out.println(a);

        // Program11.java:5: error: unexpected type
        //  int a = 11++;
        //          ^
        //  required: variable
        // found:    value
        // 1 error
        //we can not perform this operation.
    }
}