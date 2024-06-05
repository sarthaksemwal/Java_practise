import java.util.Scanner;

public class SumofRow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matrix 1:");
        printMatrix(arr1);

        System.out.println("Sum of every row in the matrix:");
        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr1[0].length; j++) {
                sum += arr1[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}