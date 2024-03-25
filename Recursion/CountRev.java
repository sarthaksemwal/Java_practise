import java.util.Scanner;
public class CountRev {
    public static void count(int start, int n){

        if(start>n) return;
        System.out.println(start);
        count(start+1,n);
        return;



    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=1;
        System.out.println("Enter the number :");
        int number=scan.nextInt();
        count(a,number);
        scan.close();

    }
    
}
