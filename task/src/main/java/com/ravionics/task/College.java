package com.ravionics.task;

import jakarta.persistence.*;

@Entity
@Table(name = "college")
public class College {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_name", referencedColumnName = "name")
    private Course course;
    
    @Column(name = "course_fee", nullable = false)
    private Integer courseFee;
    
    @Column(name = "course_duration", nullable = false)
    private Integer courseDuration;
    
    @Column(name = "accommodation_type", nullable = false)
    private String accomodationType;
    
    @Column(name = "accommodation_fee", nullable = false)
    private Double accommodationFee;
    
    // constructors, getters, and setters
    
    public College() {}
    
    public College(String name, Course course, Integer courseFee, Integer courseDuration,
            String accommodationType, Double accommodationFee) {
        this.name = name;
        this.course = course;
        this.courseFee = courseFee;
        this.courseDuration = courseDuration;
        this.accomodationType = accommodationType;
        this.accommodationFee = accommodationFee;
    }
    
    // getters and setters
    
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
    
    public Course getCourse() {
        return course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public Integer getCourseFee() {
        return courseFee;
    }
    
    public void setCourseFee(Integer courseFee) {
        this.courseFee = courseFee;
    }
    
    public Integer getCourseDuration() {
        return courseDuration;
    }
    
    public void setCourseDuration(Integer courseDuration) {
        this.courseDuration = courseDuration;
    }
    
    public String getAccommodationType() {
        return accomodationType;
    }
    
    public void setAccommodationType(String accommodationType) {
        this.accomodationType = accommodationType;
    }
    
    public Double getAccomodationFee() {
        return accommodationFee;
    }
    
    public void setAccomodationFee(Double accommodationFee) {
        this.accommodationFee = accommodationFee;
    }
}


