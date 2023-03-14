public class circularLinkList {
    Node head,tail;
    static class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
        }
    }
    void insertElements(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
            tail.next=n;
        }
        else{
            tail.next=n;
            tail=n;
            tail.next = head;
        }
    }
    void display(){
        Node n1 = head;
        if(tail==null){
            System.out.println("Empty");
        }
        else{
            do{
                System.out.println(n1.data);
                n1 = n1.next;
            }while(n1.next!=head);
        }
    }
    public static void main(String[] args) {
        circularLinkList c = new circularLinkList();
        System.out.println(c);
        c.insertElements(3);
        c.insertElements(4);
        c.display();
        c.insertElements(45);
        c.display();
        System.out.println("");
        System.out.print("deleting ");
    }
}
