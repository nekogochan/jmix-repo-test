package com.company.jmixrepotest.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "JRT_ANIMAL", indexes = {
        @Index(name = "IDX_JRT_ANIMAL_ZOO", columnList = "ZOO_ID")
})
@Entity(name = "jrt_Animal")
public class Animal {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @NotNull
    @JoinColumn(name = "ZOO_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Zoo zoo;

    @Column(name = "AGE")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}