class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i+=k)
        {
          int s=i;
          int e=Math.min(i+k-1,n-1);
          while(s<e)
          {
              int temp=arr[e];
              arr[e]=arr[s];
              arr[s]=temp;
              s++;
              e--;
          }
        }
        
        
       
    }
}