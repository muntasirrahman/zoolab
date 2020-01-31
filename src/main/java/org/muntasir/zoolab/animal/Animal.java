package org.muntasir.zoolab.animal;

import java.util.Locale;
import java.util.ResourceBundle;

public class Animal {

    protected ResourceBundle resourceBundle;

    private String id;

    private String species;

    public Animal() {
        resourceBundle = ResourceBundle.getBundle("animal", Locale.getDefault());
        this.species = getClass().getSimpleName();
    }

    public String getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void changeLanguage(String language, String country) {
        Locale locale = new Locale(language, country);
        resourceBundle = ResourceBundle.getBundle("animal", locale);
    }
}
