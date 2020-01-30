package org.muntasir.zoolab.animal;

import java.util.Locale;
import java.util.ResourceBundle;

public class Animal {

    protected ResourceBundle resourceBundle;

    public Animal() {
        resourceBundle = ResourceBundle.getBundle("animal", Locale.getDefault());
    }

    public void changeLanguage(String language, String country) {
        Locale locale = new Locale(language, country);
        resourceBundle = ResourceBundle.getBundle("animal", locale);
    }
}
