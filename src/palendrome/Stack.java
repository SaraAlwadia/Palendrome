

package palendrome;

public class Stack {
    int A[];
    int top;
    int size;

    public Stack(int n) {
        A = new int[n];
        top = -1;
        size = 0;
    }
    
    public boolean isEmpty() {
        if (top < 0) { // -1
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull() {
        if (size == A.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(int e) {
        if (isFull()) {
            System.out.println("Sorry! your stack is full");
        } else {
            top++;
            A[top] = e;
            size++;
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int temp = A[top];
            top--;
            size--;
            return temp;
        }
    }    
}
