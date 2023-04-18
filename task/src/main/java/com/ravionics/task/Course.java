package com.ravionics.task;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", unique = true)
    private String name;
    
    @Column(name = "fee")
    private Double fee;
    
    public Course() {}
    
    public Course(String name, Double fee) {
        this.name = name;
        this.fee = fee;
    }
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getFee() {
        return fee;
    }
    
    public void setFee(Double fee) {
        this.fee = fee;
    }
}
