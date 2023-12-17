import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=scan.nextInt();
        int a=0,b=1,c;
            System.out.println("Fibbonacci Series upto" +num+ "is ");
        for(int i=0;i<num;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;


        }
    
        scan.close();
    }
    
}
