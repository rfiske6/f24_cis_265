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
    
    Node<T> head, tail;
    
    public LinkedList265()
    {
        head = tail = null;
    }
    
    public LinkedList265(T val)
    {
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
}
