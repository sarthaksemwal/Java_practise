import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a: " + a + ", Value of b: " + b);    
        
        scan.close();
        
    }
    
}
