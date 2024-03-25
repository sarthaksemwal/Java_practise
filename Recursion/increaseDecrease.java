import java.util.Scanner;

public class increaseDecrease {

    public static void count(int n){
        if(n==0) return;
        System.out.println(n);
        count(n-1);
        System.out.println(n);
        return;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you :");
        int number=scan.nextInt();
        count(number);
        scan.close();


        
    }
    
}
