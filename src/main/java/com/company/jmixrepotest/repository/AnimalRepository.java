package com.company.jmixrepotest.repository;

import com.company.jmixrepotest.entity.Animal;
import com.company.jmixrepotest.entity.Zoo;
import com.company.jmixrepotest.repository.custom.AnimalRepositoryCustom;
import io.jmix.core.FetchPlan;
import io.jmix.core.repository.JmixDataRepository;

import java.util.List;
import java.util.UUID;

public interface AnimalRepository extends JmixDataRepository<Animal, UUID>, AnimalRepositoryCustom {
    List<Animal> findByZoo(Zoo zoo, FetchPlan fetchPlan);
}
