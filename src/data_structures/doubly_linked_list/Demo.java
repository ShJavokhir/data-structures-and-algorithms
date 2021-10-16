/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 16/10/21<br/>
 * Time: 19:16<br/>
 * ID: U2010257<br/>
 * Telegram: @ShJavohir<br/>
 * Github: https://github.com/ShJavokhir<br/>
 */

package data_structures.doubly_linked_list;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 16/10/21<br/>
 * Time: 19:16<br/>
 */
public class Demo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> numbers = new DoublyLinkedList<>();
        numbers.addFront(5);
        numbers.addLast(6);
        numbers.addFront(1);
        numbers.addLast(8);
        System.out.println(numbers.toString());

    }
}
