class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>h=new HashMap<>();
        int max=-1;
        int left=0;
       
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            h.put(ch,h.getOrDefault(ch,0)+1);
            
            while(h.size()>k)
            {
                char c=s.charAt(left);
                h.put(c,h.getOrDefault(c,0)-1);
                
                if(h.get(c)==0)
                {
                    h.remove(c);
                }
                
                left++;
                
            }
            
            if(h.size()==k)
            {
                max=Math.max(max,i-left+1);
            }
        }
        
        return max;
    }
}