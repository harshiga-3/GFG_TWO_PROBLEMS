/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node curr=head;
        Node prev=null;
        int pos=1;
        if(x==1)
        {
            head=head.next;
        }
        else{
        
        while(curr!=null)
        {
            if(pos==x)
            {
                prev.next=curr.next;
                break;
                
            }
            prev=curr;
            curr=curr.next;
            pos++;
            
        }
        }
        
        return head;
    }
}