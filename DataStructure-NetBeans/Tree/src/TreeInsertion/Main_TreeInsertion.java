/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeInsertion;

import tree.Node;

/**
 *
 * @author arja
 */
public class Main_TreeInsertion 
{
    public static void Main_TreeInsertion_()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        BuildLevelOrderTree(arr);
    }
    
    public static void BuildLevelOrderTree(int arr[])
    {
        // BuildTree
        Node rootNode = new Node();
        for(int i = 0;i<arr.length;i++)
        {
            rootNode = LevelOrderInsertion.Insert(rootNode, arr[i]);
        }
        
        // Traverse Tree
        TreeTraversal.LevelOrderTraversal.TraverseTree(rootNode);
    }
    
}
