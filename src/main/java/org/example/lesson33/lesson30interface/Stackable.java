package org.example.lesson33.lesson30interface;

public interface Stackable {
    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element) throws StackIsFullException;

    int deleteElementFromStack() throws StackIsEmptyException;

    int readTop();
}