import java.util.Scanner;
public class UpperLower {

    //main function
    public static void main(String[] args) {
        //taking the user input

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the char to check for upper and lower case:");
        char a=scan.next().trim().charAt(0);
        if(a>='a' && a<='z'){
            System.out.println("The given char is in lowercase");
        }
        else{
            System.out.println("The given char is in Uppercase");

        }
        



        scan.close();
        
    }
    
}
