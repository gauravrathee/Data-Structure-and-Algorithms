import java.util.*;
class Solution
{
    static class TreeNode{
        int data;
        TreeNode left,right,random;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
static TreeNode copyLeftRight(TreeNode root,HashMap<TreeNode,TreeNode> hm)
    {
        if(root==null)
        return null;
        TreeNode cloned=new TreeNode(root.data);
        hm.put(root,cloned);
        cloned.left=copyLeftRight(root.left,hm);
        cloned.right=copyLeftRight(root.right,hm);
        
        return cloned;
    }
     static void copyRandom(TreeNode root,TreeNode cloned,HashMap<TreeNode,TreeNode> hm)
    {
        if(cloned==null)
        return;
        cloned.random=hm.get(root.random);
      copyRandom(root.left,cloned.left,hm);
    copyRandom(root.right,cloned.right,hm);
    }
    public static TreeNode cloneTree(TreeNode root){
        if(root==null)
        return null;
     HashMap<TreeNode,TreeNode> hm=new HashMap<>();
     TreeNode cloned=copyLeftRight(root,hm);
     copyRandom(root,cloned,hm);
     return cloned;
     }
     
     public static void main(String[] args)
     {
     TreeNode root=new TreeNode(1);
     root.left=new TreeNode(2);
     root.right=new TreeNode(3);
     root.left.left=new TreeNode(4);
     root.left.right=new TreeNode(5);
     
     root.random=root.left.right;
     root.left.random=root;
     root.right.random=root.left.left;
     root.left.left.random=root.left.right;
     root.left.right.random=root;
     
     TreeNode cloned=cloneTree(root);
     
     
     }
     }
