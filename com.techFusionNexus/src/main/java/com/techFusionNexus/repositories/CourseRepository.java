package com.techFusionNexus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techFusionNexus.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	Course findByCourseId(int courseId);
}
