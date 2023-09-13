import java.util.Scanner;
class LargestNum{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int max;
        int a=scan.nextInt();
         int b=scan.nextInt();
          int c=scan.nextInt();
          //assuming max no is a to compare with other variables
          max=a;
          if(b>max){
            max=b;
          }
          if(c>max){
            max=c;
          }
          System.out.println(max);

          scan.close();
          


    }
}