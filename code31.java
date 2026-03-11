class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>b=new ArrayList<>();
        
        for(int n:arr)
        {
            if(n>=0){a.add(n);}
            else{
                b.add(n);
            }
        }
        int i=0;int k=0;
        int j=0;
        
        while(i<a.size() && j<b.size())
        {
            arr.set(k++,a.get(i++));
           arr.set(k++,b.get(j++));
           
        }
        while(i<a.size())
        {
             arr.set(k++,a.get(i++));
        }
        while(j<b.size())
        {
              arr.set(k++,b.get(j++));
        }
        
     
    }
}