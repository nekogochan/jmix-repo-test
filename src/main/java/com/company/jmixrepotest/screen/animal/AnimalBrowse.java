package com.company.jmixrepotest.screen.animal;

import com.company.jmixrepotest.entity.Zoo;
import com.company.jmixrepotest.repository.AnimalRepository;
import com.company.jmixrepotest.repository.ZooRepository;
import io.jmix.core.*;
import io.jmix.ui.screen.*;
import com.company.jmixrepotest.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.function.Consumer;

@UiController("jrt_Animal.browse")
@UiDescriptor("animal-browse.xml")
@LookupComponent("animalsTable")
public class AnimalBrowse extends StandardLookup<Animal> {

    @Autowired
    ApplicationContext ctx;
    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    FetchPlans fetchPlans;
    @Autowired
    ZooRepository zooRepository;
    @Autowired
    DataManager dataManager;

    @Subscribe
    public void onInit(InitEvent event) {
        try {
            var zoo = zooRepository.findByName("e",
                    fetchPlans.builder(Zoo.class).add("id").build()).get(0);
            zoo.getName();
        } catch (Exception ex) {
            System.out.println("ex on getName");
        }

        try {
            var zoo = zooRepository.findByName("e",
                    fetchPlans.builder(Zoo.class).add("id").build()).get(0);
            zoo.getOwner();
        } catch (Exception ex) {
            System.out.println("ex on getOwner");
        }
    }
}