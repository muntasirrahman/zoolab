package org.muntasir.zoolab.animal;

import org.muntasir.SoundEmitter;

public class Parrot extends Bird {

    private String sound = "";

    public void liveNearby(SoundEmitter soundEmitter) {
        System.out.println("I live near a " + soundEmitter.getClass().getSimpleName());
        this.sound = soundEmitter.sing();
    }

    @Override
    public String sing() {
        System.out.println("I repeat " + sound);
        return sound;
    }
}
