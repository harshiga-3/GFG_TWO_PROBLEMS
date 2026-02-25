class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        int sum=0;
        HashMap<Integer,Integer>m=new HashMap<>();
        int maxlen=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>k)
            {
                sum++;
            }
            else{
                sum--;
            }
            
            if(sum>0)
            {
                maxlen=i+1;
            }
            if(!m.containsKey(sum))
            {
                m.put(sum,i);
            }
            
            if(m.containsKey(sum-1))
            {
                int len=i-m.get(sum-1);
                maxlen=Math.max(len,maxlen);
            }
        }
        return maxlen;
    }
}