class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        int []f=new int[100000];
        
        for(int i=0;i<arr.length;i++)
        {
            f[arr[i]]++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(f[arr[j]]>1)
            {
                return j+1;
            }
        }
        return -1;
    }
}
