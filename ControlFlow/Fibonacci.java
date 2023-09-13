import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=0,b=1,count=2,temp;
        System.out.println("Enter the digit you want fibonacci number of:");
        int n=scan.nextInt();
        while(count<=n){
            temp=b;
            b+=a;
            a=temp;
            count++;
        }
        System.out.println(b);
        scan.close();

    }
}