import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Stack;

public class dsa4 {
    public static void main(String[] args) {
        LinkedList<Integer> in = new LinkedList<>();
        LinkedList<Integer> in1 = new LinkedList<>();
        for(int i=1;i<11;i++){
            in.add(i);
        }
        /*int a1 = in.toArray().length;
        for(int i =0;i<a1;i++){
            System.out.println(in.get(i));
        } Or :- */
        Iterator it = in.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(" "+"\n");


        in.sort(null);
        int num = in.toArray().length;
        for(int i = 0; i<num; i++) {
            int y = in.get(i);
            in1.push(y);
        }
        System.out.println(in1.stream().map(x->x*2).collect(Collectors.toList()));
        System.out.println(in1.stream().map(x->x*3).collect(Collectors.toList()));
        System.out.println(in1.stream().map(x->x*4).collect(Collectors.toList()));
        System.out.println(in1.stream().map(x->x*5).collect(Collectors.toList()));
        System.out.println(in1.stream().map(x->x*6).collect(Collectors.toList()));

        System.out.println(" ");

        for(int i=0;i<10;i++){
            for(int j =1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        System.out.println("");
        in.addFirst(99);// add element from the first
        in.add(1,3456);// add element at ant any position
        in.push(2333);// add element in the first of the linked list;
        in.addLast(4444);// add element in the last of the linked list;
        System.out.println(in);
        in.remove();// remove element from the first of linkedList;
        in.clear();
        System.out.println("\n"+"This in the empty linkedList after clear method:-"+in);
        /*in.removeLast();
        in.removeFirst();*/

        Stack<Integer> s = new Stack<>();
        LinkedList<Integer> n = new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        n.addAll(s);
        System.out.println(n);

        LinkedList<Integer> l3 = new LinkedList<>();
        if(l3.toArray().length==0){
            System.out.println("\n"+"The Linked list is empty");
        }
        else{
            System.out.println("The linked list has some element");
        }

    }
}
