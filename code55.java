/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    int countNonLeafNodes(Node root) {
        // code here
        Queue<Node>q=new LinkedList<>();
        
        int c=0;
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            
            if(curr.left!=null || curr.right!=null)
            {
                c++;
            }
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
        
        return c;
        
    }
}