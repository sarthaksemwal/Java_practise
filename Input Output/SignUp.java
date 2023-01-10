import java.util.Scanner;

public class SignUp {

    //main methoud
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //taking information 

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        System.out.println("\nEnter your first name: ");
        String firstName=scan.nextLine();
        System.out.println("\nEnter your last name: ");
        String lastName=scan.nextLine();
        System.out.println("\nPick a user name : ");
        String userName=scan.nextLine();
        System.out.println("\nEnter your country : ");
        String country=scan.nextLine();
        System.out.println("\nHow old are you : ");
        int age=scan.nextInt();

        //printing information 

        System.out.println("***************************************");
        System.out.println("First name:"+firstName);
        System.out.println("Last name:"+lastName);
        System.out.println("Your age:"+age);
        System.out.println("Your User name:"+userName);
        System.out.println("Your Country:"+country);
       
       System.out.println("Thank you for joining JavaGram!");
      //closing the scanner
       scan.close(); 

     
    }
}
