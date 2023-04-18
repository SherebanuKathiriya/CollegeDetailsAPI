package com.ravionics.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colleges")
public class CollegeController {
	
	@Autowired
	CollegeRepo collegeRepo;
	
	@Autowired
	CourseRepo courseRepo;
	//While using CRUDRepository
//	@GetMapping("/")
//	public List<CollegeDTO> getAllColleges() {
//	    List<College> colleges = (List<College>) repo.findAll();
//	    List<CollegeDTO> collegeDTOs = new ArrayList<>();
//
//	    for (College college : colleges) {
//	        CollegeDTO collegeDTO = new CollegeDTO();
//	        collegeDTO.setId(college.getId());
//	        collegeDTO.setName(college.getName());
//	        collegeDTO.setCourseName(college.getCourse());
//	        collegeDTO.setCourseFee(college.getCourseFee());
//	        collegeDTO.setCourseDuration(college.getCourseDuration());
//	        collegeDTO.setAccommodationType(college.getAccommodationType());
//	        collegeDTO.setAccommodationFee(college.getAccomodationFee());
//	        collegeDTOs.add(collegeDTO);
//	    }
//
//	    return collegeDTOs;
//	}
	
	//Using JpaRepository
	@GetMapping("/")
	public List<College> getAllColleges(){
		return collegeRepo.findAll();
	}
	
	
	@GetMapping("/{courseName}")
	public List<College> getCollegesByCourse(@PathVariable("courseName") String courseName) {
	    Course course = courseRepo.findByName(courseName);
	    return collegeRepo.findByCourse(course);
	}

}




















