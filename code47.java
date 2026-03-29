class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int low=0;int ans=-1;
        int right=arr.length-1;
        
        while(low<=right)
        {
            int mid=(low+right)/2;
            
            if(arr[mid]<=x)
            {
                ans=mid;
                low=mid+1;
            }
        else 
        {
           right=mid-1; 
        }
        }
        
        return ans;
        
    }
}
