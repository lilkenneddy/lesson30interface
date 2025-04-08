package org.example.lesson33.lesson30interface;

import java.util.Optional;

public class Stack implements Stackable {
    private final int maxSize;
    private final int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    @Override
    public void addElementToStack(int element) throws StackIsFullException {
        if (isFull()) {
            throw new StackIsFullException();
        }
        stackArray[++top] = element;
    }

    @Override
    public int deleteElementFromStack() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        return stackArray[top--];
    }

    @Override
    public int readTop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        return stackArray[top];
    }

    public Optional<Integer> getTopOptional() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(stackArray[top]);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }
}