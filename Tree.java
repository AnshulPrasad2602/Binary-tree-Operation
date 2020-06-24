/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;



import java.util.Stack;

/**
 *
 * @author ANSHUL
 */
public class Tree 
{
    private TreeNode root;

    public Tree() 
    {
        this.root = null;
    }

    public TreeNode getRoot() 
    {
        return root;
    }

    public void setRoot(TreeNode root) 
    {
        this.root = root;
    }
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(int value)
    {
        TreeNode newNode = new TreeNode(value);
        
        if (this.isEmpty())
        {
            root = newNode;
        }
        else
        {
            TreeNode temp = root;
            while(true)
            {
                if (value < temp.getData())
                {
                    if (temp.getLeftChild() == null)
                    {
                        temp.setLeftChild(newNode);
                        break;
                    }
                    else
                    {
                        temp = temp.getLeftChild();
                    }
                }
                else if (value > temp.getData())
                {
                    if (temp.getRightChild() == null)
                    {
                        temp.setRightChild(newNode);
                        break;
                    }
                    else
                    {
                        temp = temp.getRightChild();
                    }
                }
                else if (value == temp.getData())
                {
                    break;
                }
            }
        }
    }
    
    public void traversalInorder()
    {
        TreeNode temp = root;
        Stack<TreeNode> stack = new Stack<>();
        
        while(true)
        {
            while(temp != null)
            {
                stack.push(temp);
                temp = temp.getLeftChild();
            }
            
            if(stack.isEmpty())
            {
                break;
            }
            
            temp = stack.pop();
            System.out.println("Data = " + temp.getData());
            
            temp = temp.getRightChild();
        }
        
    }
    
    public TreeNode get(int value)
    {
        if (root != null)
        {
            TreeNode temp = root;
            while(true)
            {
                if (value < temp.getData())
                {
                    if (temp.getLeftChild() == null)
                    {
                        break;
                    }
                    else
                    {
                        temp = temp.getLeftChild();
                    }
                }
                else if (value > temp.getData())
                {
                    if (temp.getRightChild() == null)
                    {
                        
                        break;
                    }
                    else
                    {
                        temp = temp.getRightChild();
                    }
                }
                else if (value == temp.getData())
                {
                    return temp;
                }
            }
            return null;
        }
        
        return null;
    }
    
    public int min()
    {
        if (root != null)
        {
            TreeNode temp = root;
            while (temp.getLeftChild() != null)
            {
                temp = temp.getLeftChild();
            }
            return temp.getData();
        }
        return Integer.MIN_VALUE;
    }
    
    public int max()
    {
        if (root != null)
        {
            TreeNode temp = root;
            while (temp.getRightChild() != null)
            {
                temp = temp.getRightChild();
            }
            return temp.getData();
        }
        return Integer.MAX_VALUE;
    }
    
    public void deleteNode(int value)
    {
        TreeNode temp, parent = null, replace, father, son;
        
        temp = root;
        
        while(temp.getData() != value && temp != null)
        {
            if(value < temp.getData())
            {
                parent = temp;
                temp = temp.getLeftChild();
            }
            else
            {
                parent = temp;
                temp = temp.getRightChild();
            }
        }
        
        if (temp == null)
        {
            return;
        }
        
        if(temp.getLeftChild() == null)
        {
            replace = temp.getRightChild();
        }
        else if(temp.getRightChild() == null)
        {
            replace = temp.getLeftChild();
        }
        else
        {
            //finding smallest element on the right sub-tree
            father = temp;
            replace = temp.getRightChild();
            son = replace.getLeftChild();
            
            while(son != null)
            {
                father = replace;
                replace = son;
                son = son.getLeftChild();
            }
            
            if(father != temp)
            {
                father.setLeftChild(replace.getRightChild());
                replace.setRightChild(temp.getRightChild());
            }
            replace.setLeftChild(temp.getLeftChild());
        }
        
        if(parent == null)
        {
            root = replace;
        }
        else
        {
            if(temp == parent.getLeftChild())
            {
                parent.setLeftChild(replace);
            }
            else
            {
                parent.setRightChild(replace);
            }
        }
    }
}
