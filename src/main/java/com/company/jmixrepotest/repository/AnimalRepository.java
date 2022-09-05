package com.company.jmixrepotest.repository;

import com.company.jmixrepotest.entity.Animal;
import com.company.jmixrepotest.entity.Zoo;
import io.jmix.core.FetchPlan;
import io.jmix.core.repository.JmixDataRepository;
import io.jmix.core.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AnimalRepository extends JmixDataRepository<Animal, UUID> {
    List<Animal> findByZoo(Zoo zoo, FetchPlan fetchPlan);

    @Query("where e.zoo.name = :zooName")
    List<Animal> findByZooName(String zooName, FetchPlan fetchPlan);
}
