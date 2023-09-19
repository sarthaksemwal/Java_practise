import java.util.Scanner;
public class FibonacciNo {
    public static void main(String[] args) {
        int next=0,a=0,b=1;
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        for(int i=1;i<=num;i++){
            next=a+b;
            a=b;
            b=next;


        }
        System.out.println(next);
        scan.close();
    }
}
