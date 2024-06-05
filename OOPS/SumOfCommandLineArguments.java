public class Final {
    final int x=10;
    final int y;
    final static int z;
    Final(){
        y=50;
    }
    static{
        z=70;
    }
        public static void main(String[] args){
        Final f=new Final();
        System.out.println(f.y);
//        z=200;

        }
}


public class SumOfCommandLineArguments {

    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum of command line arguments: " + sum);
    }
}
