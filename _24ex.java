class _24ex 
{
    static void getChar(String str) 
    { 
  
        // Traverse the string using for loop 
        for (int i = 0; i < str.length(); i++) { 
  
            // Printing the current character 
            System.out.print(str.charAt(i)); 
  
            // Printing a space after each letter 
            System.out.print(" "); 
        } 
    } 
  
    // Method 2 
    // Main driver method 
    public static void main(String[] args) 
    { 
  
        // Creating a String variable to store the string 
        String str = "hello world"; 
  
        // Calling the getChar method 
        getChar(str); 
    }     
}
