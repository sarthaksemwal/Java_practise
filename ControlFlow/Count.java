import java.util.Scanner;

public class Count {
    //Note we use for loop when we know how many times we have to run the code;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       System.out.println("Choose a no you want to count through:");
         
       int a=scan.nextInt();
       System.out.println("--------------------------------------");
        for(int i=0;i<=a;i++){
            System.out.println(i);
        }
        scan.close();
    }
}
