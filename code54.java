/* A Binary Tree node
class Node
{
	int data;
	Node left, right;
} */

class Solution {
	int countLeaves(Node node) {
		// Your code
		Queue<Node>q = new LinkedList<>();
		
		q.add(node); int c = 0;
		
		while (!q.isEmpty())
			{
			Node curr = q.poll();
			
			if (curr.left != null)
				{
				q.add(curr.left);
			}
			if (curr.right != null)
				{
				q.add(curr.right);
			}
			if (curr.left == null && curr.right == null)
				{
				c++;
			}
		}
		
		return c;
	}
}
