import java.util.Scanner;
import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        int i;
        System.out.println("Enter the array: ");
        for(i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        scan.close();


    }
    
}
