//import Scanner
import java.util.Scanner;

public class Chatbot {
    //main methoud
    public static void main(String[] args) {
        
        //set up scanner. 
        Scanner scan= new Scanner(System.in);
 System.out.println("\nHello. What is your name?");
        String name=scan.nextLine();
        System.out.println("Hi  " + name + "! I'm Javabot. Where are you from?");
        String place=scan.nextLine();
        System.out.println("I hear it's beautiful at " + place + " ! I'm from a place called Oracle");
        System.out.println("\tHow old are you?");
        int age=scan.nextInt();
        System.out.println("So you're " + age + "  cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + "  times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //we are using this because nextLine gets Skipped if used ahead of nextInt
        scan.nextLine();
        String lang=scan.nextLine();
        System.out.println(lang + " , that's great! Nice chatting with you  " + name + " . I have to log off now. See ya!");
        
        //close scanner. 
        scan.close();

        
    }
}
