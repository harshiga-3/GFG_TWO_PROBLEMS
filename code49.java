class twoStacks {
    int[] arr = new int[100];
    int size = 100;
    int top1, top2;
    
    twoStacks() {
        // Coder here    
    top1=-1;
    top2=arr.length;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1+1!=top2){
        arr[++top1]=x;
        }
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code herearr
        if(top1+1!=top2){
        arr[--top2]=x;
        }
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(top1!=-1)
        {
       return arr[top1--];
        }
        return -1;
    }
        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code herea
        if(top2!=arr.length)
        {
        return arr[top2++];
        }
        return -1;
    }
}