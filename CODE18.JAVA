class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        ArrayList<Integer>a=new ArrayList<>();
        
        int n=arr1.length;
        int j=arr2.length-1;
        int diff=Integer.MAX_VALUE;int sum=0;
        int mindiff=Integer.MAX_VALUE;
        int i=0;
        int res=0;
        int res1=0;
        while(i<n && j>=0)
        {
           sum=arr1[i]+arr2[j];
           
           diff=Math.abs(sum-x);
           
           if(diff<mindiff)
           {
               //a.add(arr1[i]);
               //a.add(arr2[j]);
               res=arr1[i];
               res1=arr2[j];
               mindiff=diff;
           }
           if(sum>x)
           {
               j--;
           }
           else{
               i++;
           }
        }
        a.add(res);
        a.add(res1);
        
        return a;
    }
}