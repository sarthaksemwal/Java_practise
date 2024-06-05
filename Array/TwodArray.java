import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11, 12}};

        System.out.println("Matrix 1:");
        printMatrix(arr1);
        System.out.println("Matrix 2:");
        printMatrix(arr2);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                int[][] resultAdd = addMatrices(arr1, arr2);
                System.out.println("Result of addition:");
                printMatrix(resultAdd);
                break;
            case 2:
                int[][] resultSub = subtractMatrices(arr1, arr2);
                System.out.println("Result of subtraction:");
                printMatrix(resultSub);
                break;
            case 3:
                int[][] resultMul = multiplyMatrices(arr1, arr2);
                System.out.println("Result of multiplication:");
                printMatrix(resultMul);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static int[][] addMatrices(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                result[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] arr1, int[][] arr2) {
        int[][] result = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
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