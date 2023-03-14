class queue{
    int[] arr;
    int rare;
    int capacity;
    queue(int size){
        capacity = size;
        arr = new int[capacity];
    }
    public void enqueue(int value){
        if(rare==capacity&& rare!=0){
            System.out.println("There is no Space to insert that element.");
        }
        else if(rare == capacity){
            System.out.println("The Queue is empty at that time.");
        }
        else{
            arr[rare]=value;
            rare++;
        }
    }
    public void dequeue(){
       for(int i=0;i<rare-1;i++){
           arr[i]=arr[i+1];
       }
       rare--;
    }
    public void display(){
        for(int i =0;i<rare;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
public class rough3 {
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(23);
        q.enqueue(12);
        q.enqueue(7);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.display();
        System.out.println("");
    }
}
