import java.util.Scanner;
class Greatest {
    public static void main(String[] args){
        //print greatest no entered by the user

        //creating the instance of the scanner class
        Scanner scan=new Scanner(System.in);
        //taking the values from the user 
        System.out.println("Enter the first value");
        int a=scan.nextInt();
        System.out.println("Enter the second value");
        int b=scan.nextInt();
        System.out.println("Enter the third value");
        int c=scan.nextInt();
        
        //logic 
        int max=a;
        if(b>a){
            max=b;
        }
        if(c>a){
            max=c;
        }
        
    //printing the greated value out of three int value
    System.out.println("Greatest out of three int value is "+max);
    //scanner close 
        scan.close();




    }
}
