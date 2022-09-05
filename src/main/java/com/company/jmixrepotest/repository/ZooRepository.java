package com.company.jmixrepotest.repository;

import com.company.jmixrepotest.entity.Zoo;
import io.jmix.core.FetchPlan;
import io.jmix.core.repository.JmixDataRepository;

import java.util.List;
import java.util.UUID;

public interface ZooRepository extends JmixDataRepository<Zoo, UUID> {
    List<Zoo> findByName(String name, FetchPlan fetchPlan);
}
