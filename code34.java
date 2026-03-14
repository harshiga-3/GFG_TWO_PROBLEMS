class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        int max=0;
        for(int n:arr)
        {
            max=Math.max(n,max);
        }
        int []f=new int[max+1];
        
        for(int i=0;i<arr.length;i++)
        {
            f[arr[i]]++;
        }
        
        for(int j=0;j<arr.length;j++)
        {
            if(f[arr[j]]%2==1)
            {
                return arr[j];
            }
        }
        
        return -1;
    }
}