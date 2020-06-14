/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeInsertion;
import java.util.LinkedList;
import java.util.Queue;
import tree.*;
/**
 *
 * @author arja
 */
public class LevelOrderInsertion 
{
    public static Node Insert(Node rootNode, int data)
    {
        if(rootNode == null)
        {
            System.out.println("Tree is empty... Creating a new Tree");
            rootNode = new Node(data);
        }
        else
        {
            Queue<Node> q = new LinkedList<Node>();
            q.add(rootNode);
            while(!q.isEmpty())
            {
                Node top = q.poll();
                if(top.left == null)
                {
                    top.left = TreeUtils.CreateAndGetNode(data);
                    //System.out.println("Inserting "+data+" to the left of: "+top.data);
                    return rootNode;
                }
                else
                {
                    q.add(top.left);
                }
                if(top.right == null)
                {
                    top.right = TreeUtils.CreateAndGetNode(data);
                    //System.out.println("Inserting "+data+" to the right of: "+top.data);
                    return rootNode;
                }
                else
                {
                    q.add(top.right);
                }
            }
        }
        
        return rootNode;
    }
}
