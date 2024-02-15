//This is data type of byte and we can take only numbers between (-128 to 127)
class ByteDemo{
 
    public static void main(String[] args){

        byte p = 21;
        byte q = 67;
        byte r = 124;
        byte s = 344; //s is not in range of byte . The byte range is -128 to 127
                      //ByteDemo.java:8: error: incompatible types: possible lossy conversion from int to byte
                    //byte s = 344; (This is error of length)
                 ^
                
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(r*s);
        System.out.println(r/s);
        System.out.println(p%q);


    }

}