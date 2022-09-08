package com.company.jmixrepotest.repository.custom;

import com.company.jmixrepotest.entity.Animal;
import io.jmix.core.FetchPlan;

import java.util.List;

public interface AnimalRepositoryCustom {
    List<Animal> findByZooName(String zooName, FetchPlan fetchPlan);
}
