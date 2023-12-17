import java.util.Scanner;

public class max{
    //main class
    public static void main(String[] args) {
        //taking the user input
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first no");
        int a=scan.nextInt();
        System.out.println("Enter the Second no");
        int b=scan.nextInt();
        System.out.println("Enter the Third no");
        int c=scan.nextInt();

        //checking for the max number
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The largest number is " + max);
        scan.close();
        
    }
}