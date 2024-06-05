class example{

int divide(int num,int deno)throws ArithmeticException{
return num/deno;
}
}

public class throwException{
public static void main(String[] args){
example s=new example();
int a;
try{
a=s.divide(10,0);
System.out.println(a);
}
catch(ArithmeticException e){
System.out.println(e);
}
}
}