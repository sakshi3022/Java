class Program18{

    public static void main (String[] args){
        
        char ch = '1'++;
         
        System.out.println(ch);

        // Program18.java:5: error: unexpected type
        // char ch = '1'++;
        //           ^
        //  required: variable
        // found:    value
        // 1 error
    }
}