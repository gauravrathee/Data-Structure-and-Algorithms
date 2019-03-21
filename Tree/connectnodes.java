import java.util.*;
class Node{
    int data;
    Node left,right,nextRight;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
        nextRight=null;
    }
}
public class Solution {

    static void connectNodesAtSameLevel(Node root)
    {
        LinkedList<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            Node prev=null;
            for(int i=0;i<size;i++)
            {
                Node element=queue.removeFirst();
                if(element.left!=null)
                    queue.add(element.left);
                if(element.right!=null)
                    queue.add(element.right);

                if(prev==null)
                {
                    prev=element;
                }
                else
                {
                    prev.nextRight=element;
                    prev=element;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        
        connectNodesAtSameLevel(root);
    }
}
