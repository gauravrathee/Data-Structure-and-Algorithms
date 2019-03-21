class Solution
{
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
    static TreeNode head;
    static TreeNode prev=null;
    static TreeNode BinaryTreeToDLL(TreeNode root)
    {
        if(root==null)
            return root;
        
	BinaryTreeToDLL(root.left);
        
	if(prev==null)
            head=root;
	else
	{
	    prev.right=root;
	    root.left=prev;
	}
	prev=root;
        
	BinaryTreeToDLL(root.right);
        
	return head;
    }
     public static void main(String[] args)
    {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        TreeNode head=BinaryTreeToDLL(root);\\ It points to head of doubly linked list
        
        TreeNode temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.right;
        }
    }
    }
