/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author ANSHUL
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Tree intTree = new Tree();
	intTree.insert(25);
	intTree.insert(20);
	intTree.insert(15);
	intTree.insert(27);
	intTree.insert(30);
	intTree.insert(29);
	intTree.insert(26);
	intTree.insert(22);
	intTree.insert(32);
        intTree.insert(17);
            
        System.out.println("------------------Binary tree->");
        intTree.traversalInorder();
        
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8888));
        
        System.out.println(intTree.min());
        System.out.println(intTree.max());
        
        intTree.deleteNode(25);
        
        System.out.println("------------------Binary tree->");
        intTree.traversalInorder();
    }
    
}
