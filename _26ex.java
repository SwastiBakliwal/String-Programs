class _26ex 
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
 
        StringBuilder string = new StringBuilder(str);
        string.setCharAt(index, ch);
 
        // Print the modified string
        System.out.println("Modified String = " + string);
    }    
}