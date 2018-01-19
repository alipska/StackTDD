public class MyStack {

    private int size;
    private int[] elements;
    private int capacity;

    public MyStack(int capacity) {
        this.elements = new int[capacity];
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public void push(int element) throws OverflowException {
        if(isFull()) throw new OverflowException();
        this.elements[size++] = element;

    }

    private boolean isFull() {
        return size==capacity;
    }

    public int pop() throws UnderflowException {
        if (stackIsEmpty()){
            throw new UnderflowException();

        }

        return elements[--size];
    }

    private boolean stackIsEmpty() {
        return size==0;
    }
}
