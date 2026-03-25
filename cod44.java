class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer>s=new HashSet<>();
        int count=0;
        for(int n:a)
        {
            s.add(n);
        }
        for(int c:b)
        {
            if(s.contains(c))
            {
               count++;
            }
        }
        return count;
        
    }
}