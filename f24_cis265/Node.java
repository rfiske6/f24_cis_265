/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

/**
 *
 * @author fiskeremote
 */
public class Node<T> {
    private T data;
    private Node<T> next, prev;
    public Node(T val)
    {
        data = val;
        next = prev = null;
    }
    
    public Node<T> getNext()
    {
        return(next);
    }
    
    public Node<T> getPrevious()
    {
        return(prev);
    }
    
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    
    public boolean setPrevious(Node<T> previous)
    {
        if (previous == this)
        {
            return(false);
        }
        prev = previous;
        return(true);
    }
    
    public T getData()
    {
        return(data);
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    
}
