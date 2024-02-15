class Ladder2{
    
    public static void main(String[] args) {
        
        int marks = 78;

        if (marks < 35) {
            System.out.println(" You are fail");
        } else if (marks>35 ) {
            System.out.println(" You are pass");
        } else if (marks >50) {
            System.out.println(" You did it");
        } else if (marks >70 ) {
            System.out.println(" You are the topper");
        }
        else
        {
            System.out.println("Invalid number");
    
        }

    }
}