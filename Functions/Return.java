/* 1.Your function must define a return type 
 * 2.your function must return a value 
 * 3.The function calls retains the return value 
 */

public class Return {
    //main function 
    public static void main(String[] args) {
        //calling the function
        calculatearea(2.2,2.2);
                
    }
    //defining the function 
    public static double calculatearea(double length , double width ){
        double area=length*width;
        return area;    
    }
    
}
