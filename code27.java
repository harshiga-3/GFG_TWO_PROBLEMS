class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character>h=new HashSet<>();
        
        int start=0;int max=-1;
        
        for(int end=0;end<s.length();end++)
        {
            char ch=s.charAt(end);
            while(h.contains(ch))
            {
                h.remove(s.charAt(start));
                start++;
            }
            h.add(ch);
            max=Math.max(max,end-start+1);
        }
        
        return max;
    }
}