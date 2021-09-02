package _11_stack_queue.bai_tap;

public class Queue<E> {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        System.out.println("Trước khi deQueue");
        myQueue.display();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        System.out.println("SAu khi deQueue");
        myQueue.display();
    }
    class Node {
        public Object data;
        public Node next;
        public Node(Object data){
            this.data = data;
        }
    }
    private Node front;
    private Node rear;

    public Queue(){
        this.front =null;
        this.rear =null;
    }

    public void enQueue(E element) {
        Node temp = new Node(element);
        if(this.front == null){
            this.front = this.rear = temp;
        }else {
            this.rear.next = temp;
            this.rear = temp;
            this.rear.next = this.front;
        }
    }
    public void deQueue() {
        if (this.front == null){
            return;
        }
        if (this.front == this.rear) {
            this.front = this.rear = null;
        }else {
            this.front = this.front.next;
            this.rear.next = this.front;
        }
    }
    public void display(){
        Node temp = this.front;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }while(!(temp == front));
    }
}
