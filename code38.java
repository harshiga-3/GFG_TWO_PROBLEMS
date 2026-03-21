// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
       if(arr.length==0) return "";
       
       String r="";
       for(int i=0;i<arr[0].length();i++)
       {
           char c=arr[0].charAt(i);
           
           for(int j=1;j<arr.length;j++)
           {
               if(i>arr[j].length() || arr[j].charAt(i)!=c)
               {
                   return r;
               }
           }
           r+=c;
       }
       
       return r;
    }
}