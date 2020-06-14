/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;
import tree.Node;

/**
 *
 * @author arja
 */
public class LevelOrderTraversal {
    
    public static void TraverseTree(Node root)
    {
        Node n = root;
        if(n==null)
        {
            System.out.println("Tree is empty...");
            return;
        }
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(n);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp == null)
            {
                return;
            }
            System.out.print(" "+temp.data);
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        
        System.out.println("\n Level Order Tree has been printed....");
    }
    
}
