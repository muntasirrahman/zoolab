package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;
import org.muntasir.zoolab.animal.Animal;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal;

    @BeforeEach
    void setUp() {
        animal = new Bird();
    }

    @Test
    void walk() {
        Assertions.assertEquals(Action.WALK, ((Bird) animal).walk());
    }
}