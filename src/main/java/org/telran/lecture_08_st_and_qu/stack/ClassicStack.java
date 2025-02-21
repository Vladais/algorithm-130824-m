package org.telran.lecture_08_st_and_qu.stack;

public class ClassicStack {

    private final int[] data;
    private int top;
    private final int capacity;

    public ClassicStack(int size) {
        data = new int[size]; // хранилище элементов списка
        capacity = size; // размер стека
        top = -1; // индекс последнего(верхнего) элемента
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Array is empty");
        } else {
            // insert element on top of stack
            System.out.println("Inserting " + x);
            data[++top] = x;
        }
    }

    // pop elements from top of stack
    public int pop() {
        // if stack is empty no element to pop
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // pop element from top of stack
        return data[top--];
    }
//    [1][2][3][4]
//    top = 2

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return data[top];
        }
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

