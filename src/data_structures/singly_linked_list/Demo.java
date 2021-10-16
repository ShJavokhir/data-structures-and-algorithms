/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 16/10/21<br/>
 * Time: 13:27<br/>
 * ID: U2010257<br/>
 * Telegram: @ShJavohir<br/>
 * Github: https://github.com/ShJavokhir<br/>
 */

package data_structures.singly_linked_list;

public class Demo {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> numbers = new SinglyLinkedList<>();

        //pushing some elements to our linked list
        numbers.addFront(2);
        numbers.addFront(1);
        numbers.addLast(3);
        numbers.addFront(-1);
        //printing out
        System.out.println(numbers.toString());
        System.out.println("Size of linked list: " + numbers.size());
        System.out.println("Is empty: " + numbers.isEmpty());
        System.out.println("Second element: " + numbers.at(2));

        //doing some remove operations
        numbers.removeLast();
        numbers.removeFirst();
        System.out.println(numbers.toString());
        System.out.println("Size of linked list: " + numbers.size());

    }
}
