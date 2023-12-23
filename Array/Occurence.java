public class Occurence {
    /*
    Given a sorted array Arr of size N and a number X,
    you need to find the number of occurrences of X in Arr.
     */

      int count(int[] arr, int n, int x) {
        
        // code here
        int counter=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                counter++;
            }
        }
        
        return counter;
    }
    
}
