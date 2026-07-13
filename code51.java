class Solution {
    public static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        int []s=new int[n];
        Stack <Integer>st=new Stack<>();
        
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()>=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                s[i]=-1;
            }
            else{
                s[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return s;
    }
}
