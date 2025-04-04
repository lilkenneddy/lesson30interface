package org.example.lesson30interface;

public class Stack implements Stackable {
    class stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public stack(int max) {
            this.maxSize = max;
            stackArray = new int[maxSize];
            top = -1;
        }

        @Override
        public void addElementToStack(int element);
        if(

        isFull())

        {
            System.out.println("Помилка: стек заповнений");
            return;
        }

        stackArray[++top]=

        element {
            @Override
            public int deleteElementFromStack () {
                if isEmpty() {
                    System.out.println("Помилка : немає елементів для видалення так як стек пустий");
                    return -1;
                }
                return stackArray[top--];
            }
            @Override
            public int readTop () {

            }
            if isEmpty()){
                System.out.println("Помилка: ");

            }
        }
    }
}