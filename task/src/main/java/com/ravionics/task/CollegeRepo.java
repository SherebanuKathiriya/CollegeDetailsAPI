package com.ravionics.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CollegeRepo extends JpaRepository<College, Integer> {
	List<College> findByCourse(Course Course);
}
