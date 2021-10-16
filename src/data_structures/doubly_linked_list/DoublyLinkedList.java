/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 16/10/21<br/>
 * Time: 17:11<br/>
 * ID: U2010257<br/>
 * Telegram: @ShJavohir<br/>
 * Github: https://github.com/ShJavokhir<br/>
 */

package data_structures.doubly_linked_list;

import data_structures.singly_linked_list.SinglyLinkedList;

public class DoublyLinkedList <T> {

    private Node <T> head;
    private Node <T> tail;
    private int size = 0;

    private static class Node<T>{
        public T data;
        public Node <T> next;
        public Node <T> prev;
    }

    public void addFront(T data){
        Node <T> newData = new Node<>();
        newData.data = data;

        if(!isEmpty()){
            head.prev = newData;
            newData.next = head;
            head = newData;
        }else{
            head = newData;
        }

        size ++;
    }

    public void addLast(T data){
        Node <T> newData = new Node<>();
        newData.data = data;

        if(isEmpty()){
            newData.next = null;
            newData.prev = null;
            head = newData;
        }else{
            tail.next = newData;
            newData.prev = tail;
            newData.next = null;
            tail = newData;
        }
        size ++;
    }

    public int find(T dataToFind){
        if(isEmpty()) return -1;

        int foundPosition = 0;
        Node <T> trav = head;

        while(trav != null){
            if(trav.data == dataToFind){
                return foundPosition;
            }
            trav = trav.next;
            foundPosition ++;
        }
        return -1;
    }

    public T at(int position){
        if(position < 0 || position>=size) throw new RuntimeException("Wrong position");

        int i = 0;
        Node <T> trav = head;

        while(trav != null){
            if(i == position) return trav.data;
            i++;
            trav = trav.next;
        }

        return trav.data; // This line is for only compiler. This line will never be reached :(
    }

    public void removeFirst(){
        if(isEmpty()) throw new RuntimeException("No elements in linked list");

        head.next.prev = null;
        head = head.next;
        size --;

        if(isEmpty()){
            head = null;
            tail = null;
        }
    }

    public void removeLast(){
        if(isEmpty()) throw new RuntimeException("No elements in linked list");

        tail.prev.next = null;
        tail = tail.prev;
        size --;

        if(isEmpty()){
            head = null;
            tail = null;
        }
    }

    public void remove(T data){
        if(isEmpty()) throw new RuntimeException("No elements in linked list");

        Node <T> trav = head;

        while(trav != null){
            if(trav.data == data){
                trav.prev.next = trav.next;
                trav.next.prev = trav.prev;
                return;
            }
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        String result = "";
        Node<T> trav = head;
        result += "[";
        while(trav != null){
            result += trav.data + ", ";
            trav = trav.next;
        }
        result += "]";
        return result;
    }

}
