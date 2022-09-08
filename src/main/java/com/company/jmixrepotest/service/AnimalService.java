package com.company.jmixrepotest.service;

import com.company.jmixrepotest.entity.Animal;
import com.company.jmixrepotest.repository.AnimalRepository;
import io.jmix.core.FetchPlans;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;
    private final FetchPlans fetchPlans;

    public AnimalService(AnimalRepository animalRepository, FetchPlans fetchPlans) {
        this.animalRepository = animalRepository;
        this.fetchPlans = fetchPlans;
    }

    @PostConstruct
    public void init() {
        var fetchPlan = fetchPlans.builder(Animal.class).add("name").build();
        animalRepository.findByZooName("e", fetchPlan)
                .stream()
                .map(Animal::getName)
                .forEach(System.out::println);
    }
}
