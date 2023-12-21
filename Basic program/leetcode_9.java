public class leetcode_9 {
      public boolean isPalindrome(int x) {
        int digit=0,rev=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
