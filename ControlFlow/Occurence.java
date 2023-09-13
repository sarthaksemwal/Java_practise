public class Occurence {
    public static void main(String[] args) {
        //check the no of occurence of the no 5
        int a=55555;
        int count=0;
        while(a>0){
            //storing the last digit in rem 
           int rem=a%10;
            if(rem==5){
            count++;    
            }
            //slicing the last digit out of the number 
            a=a/10;

        }
        System.out.println(count);
    }
}
