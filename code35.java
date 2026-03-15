class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
       for(int i=0;i<n;i++)
       {
           while((arr[i]>0 && arr[i]<=n) && (arr[i]!=arr[arr[i]-1]) )
           {
               int idx=arr[i]-1;
               int temp=arr[i];
              arr[i]= arr[idx];
              arr[idx]=temp;
           }
       }
       
       for(int i=0;i<n;i++)
       {
           if(arr[i]!=i+1){
           return i+1;
           }
       }
       return n+1;
    }
}
