 import java.util.Scanner;
 public class Print {
// printing good morning n number of times using the recursion 
   public static void RecursivePrint(int n){
        if(n==0) return;
        System.out.println("Good morning");
        RecursivePrint(n-1);
        return;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        RecursivePrint(number);
        scan.close();
    }
 
    
 }