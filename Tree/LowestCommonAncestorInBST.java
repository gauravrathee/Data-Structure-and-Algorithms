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
    static TreeNode lowestCommonAncestorInBST(TreeNode root, int n1, int n2) 
    {
        TreeNode temp=root;
        while(temp!=null)
        {
            if(n1> temp.data && n2>temp.data)
            {
                temp=temp.right;
            }
            else if (n1< temp.data && n2<temp.data)
            {
                temp=temp.left;
            }
            else
            {
                break;
            }
        }
        return temp;
    }

     
     public static void main(String[] args)
     {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(7);
        
        TreeNode lca=lowestCommonAncestorInBST(root,3,7);
        System.out.println(lca.data); \\ We assume that both the nodes are present in given BST.
     }
     }
