import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top;
    private int size = 0;

    public CardStack(int capacity) {
        stack = new Card[capacity];
        top = 0;
    }

    public void push(Card card) {
        // resize if array is full
        if (top == stack.length) {
            Card[] newStack = new Card[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        size++;
        stack[top++] = card;
    }

    public Card pop() {
        if (isEmpty()) {
            return null;
        }
        size--;
        return stack[--top];
    }

    public Card peek() {
        if (isEmpty()) {
            return null;
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public int getSize(){ //reveals size value
        return size;
    }
}
//done
