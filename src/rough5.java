
public class rough5 {
    node head, tail;
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
        public void insertElement(int data){
            node n  = new node(data);
            if(head==null){
                head = n;
                tail = n;
                tail.next = n;
            }else{
                tail.next = n;
                tail = n;
                tail.next = head;
            }
        }
        public void display(){
        node n1 = head;
        if(tail==null){
            System.out.println("There is nothing to show .");
        }else{
            do{
                System.out.print(n1.data+" ");
                n1= n1.next;
            }while(n1.next!=head);
        }
        }
    public static void main(String[] args) {
        rough5 r = new rough5();
        r.insertElement(1);
        r.insertElement(2);
        r.insertElement(3);
        r.insertElement(4);
        r.insertElement(5);
        r.display();
    }
}
