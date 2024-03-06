package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testPushAndPop() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

    }

   /* @Test
        void testPopEmptyStack() {
        MyStack stack = new MyStack();
        assertThrows(IllegalStateException.class, stack::pop);
    }*/
}

