// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {

int s=0;
Node head;
    public myStack() {
        
        // Initialize your data members
        head=null;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return head==null;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        
    Node newnode=new Node(x);
    newnode.next=head;
    head=newnode;
    s++;
        
    
        
    }

    public void pop() {
        // Removes the front element of the stack.
        if(!isEmpty())
        {
            head=head.next;
            s--;
        }
       
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1
        if(!isEmpty())
        {
            return head.data;
        }else{
            return -1;
        }
    }

    public int size() {
        // Returns the current size of the stack.
        
        return s;
    }
}
