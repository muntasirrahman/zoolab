package org.muntasir.zoolab.main;

import org.muntasir.zoolab.animal.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@RestController
public class ResourceController {


    @GetMapping("/animal")
    public Animal getDetail(@RequestParam(value = "species", defaultValue = "Bird") String species) {

        String packageName = "org.muntasir.zoolab.animal.";
        Animal animal = null;
        try {
            Class<?> clazz = Class.forName(packageName + species);
            Constructor<?> constructor = clazz.getConstructor();
            animal = (Animal) constructor.newInstance();
            animal.setId(species + "101");
            //real one should get data from animal dao, etc.

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return animal;
    }
}
