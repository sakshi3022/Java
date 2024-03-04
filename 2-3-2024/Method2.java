class Method2{

    public static void main (String[] args){
        
        //Method 1
       wishes("Nik");
    
       //method 2 
       String name = "Shridhar";
       wishes(name);
       
       //method 3
       String friend = "Aniket";
       wishes(friend);
    }

    static void wishes(String name){

        System.out.println("Hello sir " + name);
    }
}