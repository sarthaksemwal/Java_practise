import java.util.Scanner;
import java.util.Arrays;
public class Creation{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        
        //taking the input from the user and converting it into the string and then displaying the result
        System.out.println(Arrays.toString(arr));

        //printing the array using the for loop 

        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }





        scan.close();
        
    }
}