class Solution {
    public String reverseWords(String s) {
        // Code here
        String a[]=s.split("\\.");
        StringBuilder ans=new StringBuilder();
        for(int i=a.length-1;i>=0;i--)
        {
            //StringBuilder sb=new StringBuilder(a[i]);
            if(a[i].length()==0) continue;
             if(ans.length()>0){
            ans.append(".");}
            ans.append(a[i]);
           
        }
       
        
        return ans.toString();
    }
}

