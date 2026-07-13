class Solution {
    public int maxWater(int arr[]) {
        // code here
       /* int res=0;
        for(int i=1;i<arr.length-1;i++)
        {
            int lb=arr[i];
            
            for(int j=0;j<i;j++)
            {
                if(lb<arr[j])
                {
                    lb=arr[j];
                }
            }
            int rb=arr[i];
            
            for(int k=i+1;k<arr.length;k++)
            {
                if(rb<arr[k])
                {
                    rb=arr[k];
                }
            }
            int min=Math.min(lb,rb);
           int tw=min-arr[i];
            res+=tw;
        }
        return res;*/
        int n=arr.length;
        
        int []l=new int[n];
        int []r=new int[n];
        l[0]=arr[0];
        
        for(int i=1;i<n;i++)
        {
            l[i]=Math.max(l[i-1],arr[i]);
        }
        r[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--)
        {
            r[j]=Math.max(r[j+1],arr[j]);
        }
        int water=0;
        for(int k=0;k<n;k++)
        {
            water+=Math.min(l[k],r[k])-arr[k];
        }
        return water;
        
    }
}
