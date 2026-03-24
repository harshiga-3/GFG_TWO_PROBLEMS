class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer,Integer>h=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            if(h.get(arr[i])==k)
            {
                return arr[i];
            }
        }
        
        return -1;
    }
}