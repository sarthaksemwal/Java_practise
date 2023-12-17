import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a three digit no :");
        int num=scan.nextInt();
        int sum=0,digit=0;
        int temp=num;
        while(num>0){
            digit=num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        if(sum==temp){
            System.out.println("The no is armstrong");
        }
        else{
            System.out.println("The no is not armstrong");
        }
        scan.close();
    }
    
}
