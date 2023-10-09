import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=scan.nextInt();
        int count=1;
        int SumEven=0;
        int SumOdd=0;
        while(count<=n){
            if(count%2==0){
            SumEven+=count;

            }
            else{
                SumOdd+=count;
            }
            count++;
            
        }
        System.out.println(SumEven);
        System.out.println(SumOdd);
        scan.close();
        
    }
    
}
