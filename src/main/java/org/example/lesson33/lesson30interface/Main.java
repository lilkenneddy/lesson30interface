package org.example.lesson33.lesson30interface;

import org.example.lesson33.lesson30interface.Stackable;

import java.util.SimpleTimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stackable stack = new Stack(5);

        try {
            stack.addElementToStack(10);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.addElementToStack(20);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.addElementToStack(30);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Верхній елемент: " + stack.readTop());
        try {
            System.out.println("Дістати елемент: " + stack.deleteElementFromStack());
        } catch (StackIsEmptyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Чи порожній стек: " + stack.isEmpty());
        System.out.println("Чи повний стек: " + stack.isFull());

        try {
            stack.addElementToStack(40);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.addElementToStack(50);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
        try {
            stack.addElementToStack(60);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
    }

}