import java.util.Scanner;
public class counting {
    public static void count(int n){
        if(n==0) return;
        System.out.println(n);
        count(n-1);
        return;
       
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the last number for your counting : ");
        int number=scan.nextInt();
        count(number);
        scan.close();
        
    }
}
