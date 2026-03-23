class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int s=0;
        int r=arr.length-1;
        while(s<r)
        {
            int t=arr[s];
            arr[s]=arr[r];
            arr[r]=t;
            s++;
            r--;
        }
        
    }
}