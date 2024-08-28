//import java.io.*;
class _23ex 
{
    public static void main(String[] args)
    {
        // Input string to be convert to string array
        String str = "hello world";
 
        String strArray[] = str.split(" ");
 
        System.out.println("String : " + str);
        System.out.println("String array : [ ");
 
        // Iterating over the string
        for (int i = 0; i < strArray.length; i++) {
            // Printing the elements of String array
            System.out.print(strArray[i] + ", ");
        }
 
        System.out.print("]");
    }
}   

