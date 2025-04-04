package org.example.lesson30interface;

interface Stackable {
    boolean isEmpty();        // Чи порожній стек?

    boolean isFull();         // Чи повний стек?

    void addElementToStack(int element); // Додати елемент

    void deleteElementFromStack();

    void readTop();

}
