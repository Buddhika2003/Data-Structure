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



class Main {
    public static void main(String[] args) {
        System.out.println("_Stack_");
        Stack st = new Stack();
        st.push(50);
        st.push(10);
        st.push(60);
        System.out.println("Top element: " + st.peek()); 
        System.out.println("Popped: " + st.pop());      
        System.out.println("Top after pop: " + st.peek()); 

        
    }
}

