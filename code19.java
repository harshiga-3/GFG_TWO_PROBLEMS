// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        int carry=1;
        
        for(int i=N-1;i>=0&&carry==1;i--)
        {
            
                int sum=arr.get(i)+carry;
               arr.set(i,sum%10);
                carry=sum/10;
            
           
           
        }
        ArrayList<Integer>res=new ArrayList<>();
        
        if(carry==1)
        {
            res.add(1);
        }
        for(int n:arr)
        {
            res.add(n);
        }
        return res;
        
    }
};