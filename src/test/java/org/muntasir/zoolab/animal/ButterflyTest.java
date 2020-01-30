package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest {

    Butterfly butterfly;

    @BeforeEach
    void setUp() {
        butterfly = new Butterfly();
    }

    @Test
    void sing() {
        assertEquals("", butterfly.sing());
    }

    @Test
    void fly() {
        try {
            assertEquals(Action.FLY, butterfly.fly());

        } catch (ActionException e) {
            System.err.println("ActionException occured");
        }
    }
}