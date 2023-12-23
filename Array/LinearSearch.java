
class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        int input=0;
        int i;
        int flag=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==X){
                input=i;
                flag=1;
                break;
                }
        }
        if(flag==1){
            return input;
        }
        else{
            return -1;
        }
        
    }
    
}