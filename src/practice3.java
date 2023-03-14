class arrQ{
    int front,rare;
    int capacity;
    int[] q;
    arrQ(int size){
        capacity = size;
        q = new int[capacity];
    }
    void enqueue(int value){
        if(rare==capacity){
            System.out.println("Queue is full.");
        }
        else{
            q[rare]=value;
            rare++;
        }
    }
    void dequeue(){
        if(rare==0){
            System.out.println("Queue is empty.");
        }
        else{
            for(int i =0;i<rare-1;i++){
                q[i]=q[i+1];
            }
            rare--;
        }
    }
    void display(){
        for(int i=0;i<rare;i++){
            System.out.print(q[i]+" ,");
        }
        System.out.println("");
    }
    void isEmpty(){
        if(q.length!=0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}
public class practice3 {
    public static void main(String[] args) {
        arrQ q1 = new arrQ(0);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.display();
        q1.dequeue();
        q1.display();
        q1.isEmpty();
    }
}
