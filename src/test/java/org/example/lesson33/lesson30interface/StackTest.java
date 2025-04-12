package org.example.lesson33.lesson30interface;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void addElementToStack() throws StackIsFullException {
        //given
        Stack stack = new Stack(5);
        //when
        stack.addElementToStack(1);
        stack.addElementToStack(2);
        stack.addElementToStack(3);
        stack.addElementToStack(4);
        stack.addElementToStack(5);

        //then
        assertTrue(stack.isFull());
        assertEquals(5, stack.readTop());
    }

    @Test
    void shouldDeleteElementFromStack() throws StackIsFullException {
        //given
        Stack stack = new Stack(5);
        // When
        stack.addElementToStack(10);
        stack.addElementToStack(20);
        stack.addElementToStack(40);
        stack.addElementToStack(50);
        stack.addElementToStack(60);

        int topElement = stack.readTop();

        try {
            stack.deleteElementFromStack();
        } catch (StackIsEmptyException e) {
            System.out.println("Stack is empty");
        }

        int topElementAfterDeleted = stack.readTop();

        // Then
        assertNotEquals(topElementAfterDeleted, topElement);


        Optional<Integer> topEmpty = stack.getTopOptional();
        System.out.println("Top of empty stack: " + topEmpty);

        try {
            stack.addElementToStack(42);
        } catch (StackIsFullException e) {
            System.out.println("Stack is full!");
        }
        Optional<Integer> topWithElement = stack.getTopOptional();
        System.out.println("Top after adding 42: " + topWithElement);
    }


}