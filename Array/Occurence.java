public class Occurence {

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
