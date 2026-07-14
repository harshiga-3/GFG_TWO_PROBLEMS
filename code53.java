class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        
        if(st.isEmpty())
        {
            st.push(x);
            return st;
        }
        int temp=st.pop();
        insertAtBottom(st,x);
        st.push(temp);
        
    return st;
       
    }
}