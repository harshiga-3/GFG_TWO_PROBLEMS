// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        int start=0;
        int max=0;
        HashSet<Character>h=new HashSet<>();
        for(int end=0;end<s.length();end++)
        {
            char ch=s.charAt(end);
            
            while(h.contains(ch))
            {
                h.remove(s.charAt(start));
                start++;
            }
            h.add(s.charAt(end));
            max=Math.max(max,end-start+1);
        }
        
        return max;
    }
}