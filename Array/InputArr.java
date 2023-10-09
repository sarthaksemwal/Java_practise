import java.util.Scanner;
public class InputArr {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //declaring the array 
        int arr[]=new int[5];
        //taking the input form the user
        System.out.println("Enter the elements in the array :");
        for(int i=0;i<arr.length;i++){
         arr[i]=scan.nextInt();
        }
        //printing the output
         System.out.println("The elements that you entred were:");
         for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }

    
        scan.close();
    }
    
}
