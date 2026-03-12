class Solution {
    int floorSqrt(int n) {
        // code here
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(i*i<=n)
            {
                ans=i;
            }
            
        }
        
        return ans;
    }
}