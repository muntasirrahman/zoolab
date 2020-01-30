package org.muntasir.zoolab.thing;

import org.muntasir.SoundEmitter;

public class Phone implements SoundEmitter {

    public static final String RING = "Ring-ring";

    @Override
    public String sing() {
        return RING;
    }
}
