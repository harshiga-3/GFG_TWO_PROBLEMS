class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min=Integer.MAX_VALUE;
        int sec_min=Integer.MAX_VALUE;
        ArrayList<Integer>a=new ArrayList<>();
        for(int n:arr)
        {
            if(min>n)
            {
                sec_min=min;
                min=n;
            }
            else if(min<n && sec_min>n)
            {
                sec_min=n;
            }
        }
        if(sec_min==Integer.MAX_VALUE)
        {
            a.add(-1);
        }
        else{
        a.add(min);
        a.add(sec_min);
        }
        return a;
    }
}
