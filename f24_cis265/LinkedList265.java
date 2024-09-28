/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f24_cis265;

/**
 *
 * @author fiskeremote
 */
public class LinkedList265<T> {
    
    private Node<T> head, tail;
    private int length;
    
    public LinkedList265()
    {
        length = 0;
        head = tail = null;
    }
    
    /**
     * @brief Constructor that takes a starter value
     * @param val The value that will be placed at the head
     */
    public LinkedList265(T val)
    {
        length = val != null ? 1 : 0;
        Node<T> node = new Node<>(val);
        head = tail = node;
    }
    
    /*
    Create an Add method for our linked list
    that adds the provided data to the end of our
    linked list.
    */
    public void add(T val)
    {
        if (val == null)
        {
            return;
        }
        ++length;
        Node<T> tmp = new Node<>(val);
        if (head == null)
        {
            head = tail = tmp;
        }
        else
        {
            //I want attatch the current to the new node
            //and move the tail marker to the new node
            tail.setNext(tmp);
            tmp.setPrevious(tail);
            tail = tmp;
        }
    }
    
    /*
    Override the toString method to return the following
    when a LinkedList265 is converted to a string:
    [LinkedList: <val1> <val2> <val3>...]
    vla1/val2/val3 should be relplaced by the individual 
    values stored in the list (include the < and > characters)
    */
    @Override
    public String toString()
    {
        StringBuilder bld = new StringBuilder();
        bld.append("[LinkedList: ");
        Node<T> cur = head;
        while(cur != null)
        {
            bld.append('<');
            bld.append(cur);
            bld.append("> ");
           
            cur = cur.getNext();
        }
        bld.setLength(bld.length()-1);
        bld.append("]");
        return(bld.toString());
    }
    /*
    create the following method:
    remove(int index) that will remove the value at the specified
    location in the linked list (assume the list starts at index 0
    */
    public T remove(int index)
    {
        if (index >= length || index < 0)
        {
            return(null);
        }
        else if (index == 0)
        {
            head.getNext().setPrevious(null);
            Node<T> res = head;
            head = head.getNext();

            return(res.getData());
        
        }
        else if (index == length - 1)
        {
            tail.getPrevious().setNext(null);
            Node<T> res = tail;
            tail = tail.getPrevious();
            return(res.getData());
        }
        else
        {
            Node<T> cur = head;


            for (int i = 0; i < index; i++)
            {
                cur = cur.getNext();
            }

            Node<T> prev = cur.getPrevious();
            Node<T> next = cur.getNext();
            prev.setNext(next);
            next.setPrevious(prev);
        
            return(cur.getData());
        }
    }
}
