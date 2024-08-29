class _25ex 
{
    public static void main(String args[])
    {
        // Get the String
        String str = "lets learn jaba";
 
        // Get the index
        int index = 13;
 
        // Get the character
        char ch = 'v';
 
        // Print the original string
        System.out.println("Original String = " + str);
 
        str = str.substring(0, index) + ch
              + str.substring(index + 1);
 
        // Print the modified string
        System.out.println("Modified String = " + str);
    }    
}
