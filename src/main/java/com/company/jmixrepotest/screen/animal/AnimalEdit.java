package com.company.jmixrepotest.screen.animal;

import io.jmix.ui.screen.*;
import com.company.jmixrepotest.entity.Animal;

@UiController("jrt_Animal.edit")
@UiDescriptor("animal-edit.xml")
@EditedEntityContainer("animalDc")
public class AnimalEdit extends StandardEditor<Animal> {
}