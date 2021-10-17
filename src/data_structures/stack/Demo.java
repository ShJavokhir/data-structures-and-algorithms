/**
 * Created by IntelliJ IDEA.<br/>
 * User: javokhir<br/>
 * Date: 17/10/21<br/>
 * Time: 10:29<br/>
 * ID: U2010257<br/>
 * Telegram: @ShJavohir<br/>
 * Github: https://github.com/ShJavokhir<br/>
 */

package data_structures.stack;

public class Demo {
    public static void main(String[] args) {
        Stack <Integer> numbers = new Stack<>();

        //some push operations
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        System.out.println(numbers);
        System.out.println(numbers.size());

        //some pop operations
        System.out.println();
        numbers.pop();
        numbers.pop();
        System.out.println(numbers);
        System.out.println(numbers.size());

        //other operations
        System.out.println();
        System.out.println(numbers.at(1));
        System.out.println(numbers.search(2));
        System.out.println(numbers.peek());

        System.out.println();
        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
    }
}
