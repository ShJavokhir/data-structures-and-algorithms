/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 17/10/21<br/>
 * Time: 10:13<br/>
 * ID: U2010257<br/>
 * Telegram: @ShJavohir<br/>
 * Github: https://github.com/ShJavokhir<br/>
 */

package data_structures.stack;

import data_structures.doubly_linked_list.DoublyLinkedList;

public class Stack <T> {
    private Node <T> top;
    private int size = 0;

    private static class Node <T>{
        public T data;
        public Node <T> next;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public T peek(){
        if(size == 0) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public void pop(){
        if(size == 0) throw new RuntimeException("Stack is empty");
        size --;
        if(isEmpty()){
            top = null;
        }else{
            top = top.next;
        }


    }

    public void push(T data){
        Node <T> newNode = new Node<>();
        newNode.data = data;

        if(isEmpty()){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }

        size ++;
    }

    public void clear(){
        top = null;
        size = 0;
    }

    public int search(T data){
        if(size == 0) throw new RuntimeException("Stack is empty");

        Node <T> trav = top;
        int foundPosition = 0;

        while(trav != null){
            if(trav.data == data) return foundPosition;
            trav = trav.next;
            foundPosition ++;
        }
        return -1;
    }

    public T at(int index){
        if(size == 0) throw new RuntimeException("Stack is empty");
        if(index < 0 || index >= size) throw new RuntimeException("Index out of bound of stack");

        Node <T> trav = top;
        int i = 0;
        while(trav != null){
            if(index == i) return trav.data;
            trav = trav.next;
            i++;
        }

        return trav.data; //this line is never executed, I wrote this line to avoid compilation error
    }

    @Override
    public String toString(){
        String result = "";
        Node<T> trav = top;
        result += "[";
        while(trav != null){
            result += trav.data + ", ";
            trav = trav.next;
        }
        result += "]";
        return result;
    }

}
