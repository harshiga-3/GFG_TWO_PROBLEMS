/*Complete the Function below*/
class Solution {
    
      public static boolean check(int n)
    {
        int temp=n;
        int rev=0;
        while(n>0)
        {
           int rem=n%10;
           rev=rev*10+rem;
           n/=10;
        }
        return temp==rev;
    }
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++)
        {
            
            
            
            if(!check(arr[i]))
            {
                return false;
            }
            
        }
        
        return true;
      
    }
}