class LeetcodePalindrome {
    public static boolean isPalindrome(int x) {
        int digit=0;
        int rev=0;
        int original=x;
        while(x>0){
            //slicing the last no from the digit
            digit=x%10;
            //storing the last no 
            rev=rev*10+digit;
            //slicing the digit
            x/=10;
        }
        //checking if the no is palindrome or not
        if(original==rev){
            return true;
        }
        else{
            return false;
        }
        
    }
    //main methoud
    public static void main(String[] args) {
        //calling the functions
        System.out.println(isPalindrome(121));
       System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(12345));
    }
}
