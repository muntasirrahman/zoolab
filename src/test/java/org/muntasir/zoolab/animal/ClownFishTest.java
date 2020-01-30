package org.muntasir.zoolab.animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.muntasir.zoolab.Action;

import static org.junit.jupiter.api.Assertions.*;

class ClownFishTest {

    ClownFish clownFish;

    @BeforeEach
    void setUp() {
        clownFish = new ClownFish();
    }

    @Test
    void makeJokes() {
        assertEquals(Action.MAKE_JOKES, clownFish.makeJokes());
    }
}