package org.muntasir.main;

import org.muntasir.zoolab.ActionException;
import org.muntasir.zoolab.Bird;

public class Solution {

    public static void main(String[] args) throws ActionException {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}
