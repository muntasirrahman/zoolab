package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.animal.Chicken;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    Chicken hen;
    Chicken rooster;

    @BeforeEach
    void setUp() {
        hen = new Chicken(false);
        rooster = new Chicken(true);
    }

    @Test
    void sing() {
        assertEquals(Chicken.CLUCK, hen.sing());
        assertEquals(Chicken.DOODLE, rooster.sing());
    }

    @Test
    void fly() {
        assertThrows(ActionException.class, () -> hen.fly());
        assertThrows(ActionException.class, () -> rooster.fly());
    }
}