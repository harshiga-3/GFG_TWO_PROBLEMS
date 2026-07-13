class SpecialStack {
    int []arr=new int[1000];
    int top;
    int min=Integer.MAX_VALUE;
    public SpecialStack() {
        // Define Stack
        top=-1;
    }

    public void push(int x) {
        // Add an element to the top of Stack
        arr[++top]=x;
        
    }

    public void pop() {
        // Remove the top element from the Stack
        if(!isEmpty())
        {
        top--;
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if(isEmpty())
        {
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return top==-1;
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(!isEmpty())
        {
        int min=arr[top];
        for(int i=top-1;i>=0;i--)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
        }
        
        return -1;
    }
}