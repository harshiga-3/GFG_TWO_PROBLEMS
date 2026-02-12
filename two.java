/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node next=null;
        Node curr=head;
        
        while(curr!=null)
        {
         next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
          
        return prev;
        
    }
}