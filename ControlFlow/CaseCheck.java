import java. util. *; 
public class CaseCheck {
    //main methoud
    public static void main(String[] args) {
        //scanner declare
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=scan.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Char is in Lowercase");
        }
        else{
            System.out.println(" Char is in Upper case");
        }
        scan.close();
        
    }
}
