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
public class TreeNode 
{
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) 
    {
        this.data = data;
        this.leftChild = this.rightChild = null;
    }

    public int getData() 
    {
        return data;
    }

    public void setData(int data) 
    {
        this.data = data;
    }

    public TreeNode getLeftChild() 
    {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) 
    {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() 
    {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) 
    {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode {" + "data = " + data + '}';
    }
    
    
}
