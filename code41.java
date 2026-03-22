class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int o=0;
        int e=0;
        for(int n:arr)
        {
            if(n%2==0) e++;
            else o++;
        }
        int []a=new int[2];
        
        a[0]=o;
        a[1]=e;
        return a;
    }
}