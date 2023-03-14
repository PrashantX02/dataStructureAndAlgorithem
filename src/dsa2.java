import java.util.Stack;  // calling the Stack class


import java.util.Iterator; // calling the iterator class
import java.lang.Object; // this is the object class which creating object
public class dsa2 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(34);// for adding an element
        s1.push(35);
        s1.push(36);
        s1.push(12);
        s1.push(8);
        System.out.println(s1);

        /*s1.pop();// for popOut the element or deleting the element
        System.out.println(s1);

        System.out.println(s1.peek());// peekOut the element from the stack

        boolean s = s1.empty();// its help to find out that the created stack is empty or not
        System.out.println(s);

        int index = s1.search(36);// for getting the index of the element in the stack if there is no element found it will return -1
        System.out.println(index);*/
// Print the element of the stack
        Iterator<Integer> it = s1.iterator();
        while(it.hasNext()){ // if it has next element then go it else stop
            Object s2 = it.next(); // for assigning the value it in s2 object
            System.out.print(s2+" ");
        }
        System.out.println("");
        System.out.println(s1.size());

        s1.sort(null); // for sorting an elements of the stack
        System.out.println(s1);
    }
}
