package com.example.demo2.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personId")
    private Long personId;
    @Column(name = "name")
    private String name;
    //@ManyToOne
    //@JoinColumn(name="job")
    private String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Long getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
