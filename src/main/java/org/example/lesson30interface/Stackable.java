package org.example.lesson30interface;

public interface Stackable {
    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element);

    int deleteElementFromStack();

    int readTop();
}