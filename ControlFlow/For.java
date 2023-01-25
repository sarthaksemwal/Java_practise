import java.util.Scanner;

public class For {
    //Note we use for loop when we know how many times we have to run the code;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String You want to loop:");
        String j=scan.nextLine();
        for(int i=0;i<=99;i++){
            System.out.println(j);
        }
        scan.close();
    }
}
