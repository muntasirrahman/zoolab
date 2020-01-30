package org.muntasir.zoolab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken();
    }

    @Test
    void sing() {
        assertEquals(Chicken.CLUCK, chicken.sing());
    }

    @Test
    void fly() {
        assertThrows(ActionException.class, () -> chicken.fly());
    }
}