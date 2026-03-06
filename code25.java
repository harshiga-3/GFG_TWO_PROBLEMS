class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
      
        int []a=new int[26];
        
        for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        
            a[ch-'a']++;
        }
        
        for(int j=0;j<s2.length();j++)
        {
            char c2=s2.charAt(j);
            a[c2-'a']--;
        }
        for(int k=0;k<26;k++)
        {
            if(a[k]!=0)
            {
                return false;
            }
        }
        
        return true;
        
        
        
        
        
    }
}