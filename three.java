class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left=0;
        int right=arr.length-1;
        int max_water=0;
        int h=0;
        int w=0;
        
        while(left<right)
        {
            w=right-left;
            h=Math.min(arr[left],arr[right]);
            int a=w*h;
            
            max_water=Math.max(a,max_water);
            
            if(arr[left]<arr[right])
            {
                left++;
                
            }
            else{
                right--;
            }
        }
        return max_water;
        
        
    }
}