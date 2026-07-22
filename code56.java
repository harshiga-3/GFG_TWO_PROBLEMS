/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        Queue<Node>q=new LinkedList<>();
        ArrayList<Integer>l=new ArrayList<>();
        q.add(root);
        if(root==null) return l;
        
        while(!q.isEmpty())
        {
           int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                 Node curr=q.poll();
                if(i==0)
                {
                    l.add(curr.data);
                }
                
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
        }
        
        
        return l;
    }
}