package org.example.lesson30interface1;

public interface Stackable {
    boolean isEmpty();

    boolean isFull();

    void addElementToStack(int element);

    int deleteElementFromStack();

    int readTop();
}