// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    
    Node(int x)
    {
        data=x;
        left=null;
        right=null;
    }
}

class Trees{
    Node root;
    
    public void insert(int x){
        Node newnode=new Node(x);
        if(root==null)
        {
            root=newnode;
            return;
        }
        Queue<Node>q=new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr=q.poll();
            
            if(curr.left==null)
            {
                curr.left=newnode;
                return;
            }else{
                q.add(curr.left);
            }
            
            if(curr.right==null){
                curr.right=newnode;
                return;
            }else{
                q.add(curr.right);
            }
        }
        
    }
    
    public void display(){
        if(root==null)
        {
            System.out.println("node is empty");
        }
        else{
            Queue<Node>a=new LinkedList<>();
            
            a.add(root);
            
            while(!a.isEmpty())
            {
                Node ans=a.poll();
                
                System.out.print(ans.data+" ");
                if(ans.left!=null)
                {
                    a.add(ans.left);
                }
                if(ans.right!=null)
                {
                    a.add(ans.right);
                }
                
            }
        }
    }
    public void delete(int val){
        
        Node target=null;
        Node deepest=null;
        
        Queue<Node>qq=new LinkedList<>();
        qq.add(root);
        while(!qq.isEmpty())
        {
            Node curr=qq.poll();
            
            if(curr.data==val)
            {
                target=curr;
            }
            deepest=curr;
            if(curr.left!=null)
            {
                qq.add(curr.left);
            }
            if(curr.right!=null)
            {
                qq.add(curr.right);
            }
        }
        
        if(target==null){
            System.out.println("not found target value");
        }
        target.data=deepest.data;
        
    Queue<Node>deep=new LinkedList<>();
    deep.add(root);
    
    while(!deep.isEmpty())
    {
        Node deep_val=deep.poll();
        if(deep_val.left==deepest)
        {
            deep_val.left=null;
            return;
        }
        if(deep_val.right==deepest)
        {
            deep_val.right=null;
            return;
        }
        
        if(deep_val.left!=null)
        {
            deep.add(deep_val.left);
        }
        if(deep_val.right!=null)
        {
            deep.add(deep_val.right);
        }
    }
        
    }
}
class Main {
    public static void main(String[] args) {
        //System.out.println("Start small. Ship something.");
        Trees tree=new Trees();
        tree.insert(1);
         tree.insert(2);
          tree.insert(3);
           tree.insert(4);
            tree.insert(5);
            tree.display();
            tree.delete(2);
            System.out.println("------------------");
            tree.display();
        
        
    }
}