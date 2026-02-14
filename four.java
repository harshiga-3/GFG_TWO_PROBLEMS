
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int c=0;
        for(int n:arr)
        {
            if(x>=n)
            {
                c++;
            }
        }
        return c;
    }
}