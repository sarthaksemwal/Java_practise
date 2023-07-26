import java.util.*;
public class Input_arr {
    //main methoud
    public static void main(String[] args) {
        int i,j;
        //scanner declaration
        Scanner scan=new Scanner(System.in);
        // array declartaion
        int[] arr=new int[5];
         System.out.println("Enter the no in array:");
         //taking user input in array 
        for(i=0;i<arr.length; i++){
            arr[i]=scan.nextInt();
        }
        //printing the user input
         System.out.println("The number you entered are:");
        for(j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }

       scan.close();
    }
    
}
