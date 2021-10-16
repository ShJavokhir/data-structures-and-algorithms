/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 16/10/21<br/>
 * Time: 12:33<br/>
 * ID: U2010257<br/>
 * Telegram: @ShJavohir<br/>
 * Github: https://github.com/ShJavokhir<br/>
 */

package data_structures.singly_linked_list;

public class SinglyLinkedList <T> {
    private Node <T> head;
    private Node <T> tail;
    private int size;

    //node class
    private static class Node <T> {
        public T data;
        public Node <T> next;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(T newData){
        Node <T> newNode = new Node<>();
        newNode.data = newData;
        Node <T> trav = head;
        while(trav.next != null){
            trav = trav.next;
        }
        trav.next = newNode;
        tail = newNode;
        size ++;
    }

    public void addFront(T newData){
        Node <T> newNode = new Node<>();
        newNode.data = newData;
        newNode.next = head;
        head = newNode;
        size ++;
    }

    public int search(T data){
        int foundPosition = 0;
        if(size == 0) return -1;

        Node <T> trav = head;
        while(trav != null){
            if(trav.data == data){
                return foundPosition;
            }
            trav = trav.next;
            foundPosition ++;
        }
        return -1;
    }

    public T at(int position){
        if(position <= 0 || position > size) return null;

        int i = 0;
        Node <T> trav = head;

        while (trav != null){
            if(i == position) return trav.data;
            trav = trav.next;
            i++;
        }

        return null;
    }

    public boolean contains(T data){
        return search(data) != -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void removeFirst(){
        head = head.next;
        size --;
    }

    public void removeLast(){
        Node <T> trav = head;

        while(trav.next != tail){
            trav = trav.next;
        }

        trav.next = null;
        tail = trav;
        size --;
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

    public void test(){
        System.out.println(
                head.data + "\n" +
                head.next.data + "\n"
                //head.next.next.data + "\n"
        );
    }

}
