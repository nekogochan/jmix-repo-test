package com.company.jmixrepotest.repository.custom;

import com.company.jmixrepotest.entity.Animal;
import io.jmix.core.DataManager;
import io.jmix.core.FetchPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalRepositoryCustomImpl implements AnimalRepositoryCustom {

    @Autowired
    private DataManager dataManager;

    @Override
    public List<Animal> findByZooName(String zooName, FetchPlan fetchPlan) {
        return dataManager.load(Animal.class)
                .query("where e.zoo.name = :name")
                .parameter("name", zooName)
                .fetchPlan(fetchPlan)
                .list();
    }
}
