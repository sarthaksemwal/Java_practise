import java.util.Scanner;

public class Jammed {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        //int[][]arr={{1,2,3},{2,3}};
        int [][] arr=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[4];
        for(int i=0;i< arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=s.nextInt();
           }
           System.out.println();
       }
       s.close();
    }
}