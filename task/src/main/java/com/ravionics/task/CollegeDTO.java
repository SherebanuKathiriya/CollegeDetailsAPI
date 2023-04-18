package com.ravionics.task;

public class CollegeDTO {
    private Long id;
    private String name;
    private Course courseName;
    private double courseFee;
    private int courseDuration;
    private String accommodationType;
    private double accommodationFee;

    public CollegeDTO(Long id, String name, Course courseName, double courseFee, int courseDuration, String accommodationType, double accommodationFee) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.courseDuration = courseDuration;
        this.accommodationType = accommodationType;
        this.accommodationFee = accommodationFee;
    }

    // getters and setters

    public CollegeDTO() {
		// TODO Auto-generated constructor stub
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

    public Course getCourseName() {
        return courseName;
    }

    public void setCourseName(Course course) {
        this.courseName = course;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public double getAccommodationFee() {
        return accommodationFee;
    }

    public void setAccommodationFee(double accommodationFee) {
        this.accommodationFee = accommodationFee;
    }
}
