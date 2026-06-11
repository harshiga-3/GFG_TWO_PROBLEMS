class Solution {
    public int findIndex(String s) {
        // code here
        int right=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ')')
            {
                right++;
            }
        }
        int left=0;
        
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='(') left++;
            else right--;
            
            if(left==right) return j+1;
        }
        
        return 0;
    }
}