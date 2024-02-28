//nth number print

class Question5 {
    public static void main(String[] args) {
        int n = 5; 
        int first = 0;
        int second = 1;
        int next;

        for (int i = 0; i < n -1 ; i++) { 
            next = first + second;
            first = second;
            second = next;
        }

        System.out.println("The 5th number in the Fibonacci sequence is: " + first);
    }
}

//  0   1   1   2   3   5   8   13 