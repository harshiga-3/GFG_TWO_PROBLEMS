class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int []f=new int [26];
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            f[ch-'a']++;
        }
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(f[c -'a']==1)
            {
                return c;
            }
        }
        
        return '$';
    }
}
