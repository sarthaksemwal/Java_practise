class ReverseNo{
    public static void main(String[] args) {
        int ans=0;
        int num=12345;
        while(num>0){
           int rem=num%10;
           num/=10;
           ans=ans*10+rem;
            

        }
        System.out.println(ans);
    }

}