package com.example.demo2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class jobs {
    @Id
    //@OneToMany(mappedBy = "job")
    private String jobId;
    private String description;
    private float salary;

    public jobs(String jobId, String description, float salary) {
        this.jobId = jobId;
        this.description = description;
        this.salary = salary;
    }

    public String getJobId() {
        return jobId;
    }

    public String getDescription() {
        return description;
    }

    public float getSalary() {
        return salary;
    }
}
