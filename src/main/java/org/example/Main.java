package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack();

        theStack.addElementToStack(89);
        theStack.addElementToStack(69);
        theStack.addElementToStack(45);
        theStack.addElementToStack(34);
        System.out.println(" ");

        System.out.println("Верхній елемент: " + theStack.readTop());
        System.out.println(" ");

        theStack.deleteElementFromStack();
        System.out.println("Видалено: " + theStack.deleteElementFromStack());
        System.out.println(" ");


        while (!theStack.isEmpty())
            int value = theStack.deleteElementFromStack();
        System.out.println(value);
        System.out.print(" ");


        theStack.deleteElementFromStack();
        System.out.println(" ");
    }
}