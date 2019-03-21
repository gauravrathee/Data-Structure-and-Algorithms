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
    static int diameter;
    static int height(TreeNode root)
    {
        if(root==null)
            return 0;
            
        int l=height(root.left);
        int r=height(root.right);
        return 1+Math.max(l,r);
    }
     static void diameterOfTree(TreeNode root)
     {
         if(root==null)
             return;
         int leftheight=height(root.left);
         int rightheight=height(root.right);
         diameter=Math.max(diameter,leftheight+rightheight+1);
         diameterOfTree(root.left);
         diameterOfTree(root.right);
     }
     public static void main(String[] args)
     {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(7);
        diameterOfTree(root);
        System.out.println(diameter);
     }
     }
