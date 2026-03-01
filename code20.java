class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        int k=0;
        int n=arr.length;
        
        while(j<n)
        {
            if(arr[j]!=0){
              arr[k]=arr[j];
              k++;
              j++;
             
            }
            else{
                j++;
            }
        }
        
        for(int i=k;i<n;i++)
        {
            arr[i]=0;
        }
        
        
    }
}