package org.muntasir.zoolab.main;

import org.muntasir.zoolab.animal.Rooster;

import java.util.Locale;

public class LanguageDemo {

    public static void main(String[] args) {

        Rooster rooster = new Rooster();    //default en US
        System.out.println(rooster.sing());

        rooster.changeLanguage("de", "DE"); //Germany
        System.out.println(rooster.sing());

        rooster.changeLanguage("in", "ID"); //indonesia
        System.out.println(rooster.sing());

    }
}
