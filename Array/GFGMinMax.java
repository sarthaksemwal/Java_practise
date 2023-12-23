

//User function Template for Java


 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}


public class GFGMinMax {
     static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        
        long max=a[0];
        long min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        
        return new Pair(min,max);
        
    }
    
}
