class _34ex 
{
    public static void main(String[] args)
    {
        // Considering random string for input
        String str = "hello";
 
        // Unicode at index 0
        // Input is a small string
        int result_1 = str.codePointAt(0);
        int result_2 = str.codePointAt(1);
        int result_3 = str.codePointAt(2);
        int result_4 = str.codePointAt(3);
        int result_5 = str.codePointAt(4);
 
        // Printing the input string
        System.out.println("Original String : " + str);
 
        // Prints unicode character at index 0 to 4
        // in above input string
        // to show usage of codePointAt()
        System.out.println("unicode point at 0 = "
                           + result_1);
        System.out.println("unicode point at 1 = "
                           + result_2);
        System.out.println("unicode point at 2 = "
                           + result_3);
        System.out.println("unicode point at 3 = "
                           + result_4);
        System.out.println("unicode point at 4 = "
                           + result_5);
    }    
}
