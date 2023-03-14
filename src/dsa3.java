class  queueUsingArray{
    //int front_q=0;
    int temp=0;
    int capacityOfQueue;
    int[] q1;
    queueUsingArray(int size){
        capacityOfQueue=size;
        q1 = new int[size];
    }
    void Enqueue(int value){
        if(temp==capacityOfQueue){
            System.out.println("queue is already full.you can not insert the element.");
        }
        else{
            q1[temp]=value;
            temp++;
        }
    }
    void Dequeue(){
        if(temp==0){
            System.out.println("queue is empty");
        }// rear_q is the present size of the queue;
        else{
            for(int i =0;i<temp-1;i++){
                q1[i]=q1[i+1];
            }
            temp--;// decreasing temp by 1

        }
    }
    void display(){
        if(temp==0){
            System.out.println("queue is empty,, nothing to display.");
        }
        else{
            for(int i=0;i<temp;i++){
                System.out.print(q1[i]+" ,");
            }
        }
    }
}
public class dsa3 {
    public static void main(String[] args) {
        queueUsingArray q2 = new queueUsingArray(5);
        q2.Enqueue(34);
        //q2.Enqueue(4);
        q2.Enqueue(4);
        q2.Enqueue(45);
        q2.Enqueue(23);
        q2.Enqueue(333);

        q2.display();

        q2.Dequeue();
        System.out.println("");
        q2.display();

        System.out.println("");
        q2.Dequeue();
        q2.display();
        System.out.println("");

       // int 45<=marks<=90

        /*
         for understanding :-
        int[] arr= {1,2,3,4,5,6};
        int a = arr.length-1;
        for(int i =0;i<a;i++){
            arr[i]=arr[i+1];
        }
        a--;
        for(int i =0;i<a;i++){s
            System.out.println(arr[i]);
        }
        */
    }
}
