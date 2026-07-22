/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
        Queue<Node>q1=new LinkedList<>();
        Queue<Node>q2=new LinkedList<>();
        
        q1.offer(r1);
        q2.offer(r2);
        
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            Node curr=q1.poll();
            Node curr1=q2.poll();
            if(curr==null && curr1==null) continue;
        if(curr==null || curr1==null) return false;
            
            if(curr.data!=curr1.data) return false;
            
            q1.offer(curr.left); q1.offer(curr.right);
            
         q2.offer(curr1.left);
         q2.offer(curr1.right);
        }
        
        return q1.isEmpty() && q2.isEmpty();
    }
}