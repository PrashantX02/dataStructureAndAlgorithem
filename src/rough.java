public class rough {
    node head,tail;
   static class node{
       int data;
       node next;

       node(int data){
           this.data = data;
       }

   }
   void insertElement(int data){
       node n  = new node(data);
       if(head==null){
           head = n;
           tail = n;
           tail.next=n;
       }
       else{
           tail.next=n;
           tail = n;
           tail.next = head;
       }
   }
    public static void main(String[] args) {

    }
}
