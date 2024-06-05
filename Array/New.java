import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=scan.nextInt();
        int temp=number;
        int digit;
        int count=0;
        int res=0;

        while(temp!=0){
            temp/=10;
            count++;
        }
       int temp2=number;
       while(temp2!=0){
        digit=temp2%10;
        res+=Math.pow(digit,count);
        temp2/=10;
       }

       if(res==number){
        System.out.println("number is armstrong");
       }
       else{
        System.out.println("Not armstrong");
       }
        scan.close();
    }
}
