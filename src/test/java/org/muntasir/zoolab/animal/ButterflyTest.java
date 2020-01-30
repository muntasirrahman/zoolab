package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.ActionException;

import static org.junit.jupiter.api.Assertions.*;

class ButterflyTest {

    Butterfly bf;

    @BeforeEach
    void setUp() {
        bf = Butterfly.bornAsCaterpilllar();
    }

    @Test
    void fly() {
        assertEquals(Action.WALK, bf.walk());
        assertEquals("", bf.sing());
        assertThrows(ActionException.class, () -> bf.fly()); //fail to fly

        bf.metamorph();

        try {
            //now it can fly
            assertEquals(Action.FLY, bf.fly());

        } catch (ActionException e) {
            System.err.println("ActionException occured");
        }
    }
}