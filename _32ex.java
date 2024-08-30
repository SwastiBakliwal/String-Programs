// Java Program to Convert String to InputStream
// Using ByteArrayInputStream
// Importing required libraries

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
class _32ex 
{
       // main driver method
    public static void main(String[] args) throws IOException {
        // Custom inout string as an input
        String string = "namaste";
 
        // Printing the above string
        System.out.print("String : " + string);
 
        // Now, using ByteArrayInputStream to
        // get the bytes of the string, and
        // converting them to InputStream
        InputStream stream = new ByteArrayInputStream(string.getBytes
                (Charset.forName("UTF-8")));
 
        // Creating an object of BufferedReader class to
        // take input
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
 
        // Printing the input stream
        // using rreadLine() method
        String str = br.readLine();
 
        System.out.print("\nInput stream : ");
 
        // If string is not NULL
        while (str != null) {
            // Keep taking input
            System.out.println(str);
            str = br.readLine();
        }
    }
}
