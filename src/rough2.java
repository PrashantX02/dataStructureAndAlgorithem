import java.util.Queue;
class q{
    int temp = 0;
    int capacity=0;
    int[] c ;
    q(int size){
        //this.size = size;
        capacity = size;
        c = new int[capacity];
    }
    void enqueue(int value){
        if(temp==capacity && temp==0){
            System.out.println("This queue is not enough bigger to store a single element.");
        }
        else if(temp == capacity && temp!=0){
            System.out.println("This queue is full , hence you can't store a element to it.");
        }
        else{
            c[temp]=value;
            temp++;
        }
    }
    void dequeue(){
        if(temp==0){
            System.out.println("The queue is empty at that time.");
        }
        else{
            for(int i =0;i<temp-1;i++){
                c[i]=c[i+1];
            }
            temp--;
        }
    }
    void display(){
        if(temp==0){
            System.out.println("nothing to show.");
        }
       else {
            for (int i = 0; i < temp; i++) {
                System.out.print(c[i] + " ");
            }
        }
    }
}
public class rough2 {
    public static void main(String[] args) {
        q c1 = new q(0);
        c1.enqueue(34);
        c1.enqueue(45);
        c1.enqueue(66);
        c1.display();
        c1.dequeue();
        System.out.println("");
        c1.display();
    }

}
