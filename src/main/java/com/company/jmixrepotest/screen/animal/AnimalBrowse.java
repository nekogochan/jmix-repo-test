package com.company.jmixrepotest.screen.animal;

import com.company.jmixrepotest.entity.Animal;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;


@UiController("jrt_Animal.browse")
@UiDescriptor("animal-browse.xml")
@LookupComponent("animalsTable")
public class AnimalBrowse extends StandardLookup<Animal> {
}