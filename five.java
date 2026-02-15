class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer>a=new ArrayList<>();
        
        for(int i=0;i<arr.length;i+=2)
        {
            a.add(arr[i]);
        }
        
        return a;
    }
}