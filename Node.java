class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        }
}




class Stack {
	Node top;

    public Stack() {
        top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null){System.out.println("Stack Underflow");};
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null){System.out.println("Stack is Empty");};
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}




class Queue {
    private Node front, rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {System.out.println("Queue Underflow");};
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public int peek() {
        if (front == null){System.out.println("Queue is empty");};
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}


class Main {
    public static void main(String[] args) {
        //Stack
        System.out.println("_Stack_");
        Stack st = new Stack();
        st.push(50);
        st.push(10);
        st.push(60);
        System.out.println("Top element: " + st.peek()); 
        System.out.println("Popped: " + st.pop());      
        System.out.println("Top after pop: " + st.peek()); 

        //Queue
        System.out.println("_Queue_");
        Queue q1 = new Queue();
        q1.enqueue(100);
        q1.enqueue(200);
        q1.enqueue(300);
        System.out.println("Front element: " + q1.peek()); 
        System.out.println("Dequeued: " + q1.dequeue());   
        System.out.println("Front after dequeue: " + q1.peek()); 
    }
}

