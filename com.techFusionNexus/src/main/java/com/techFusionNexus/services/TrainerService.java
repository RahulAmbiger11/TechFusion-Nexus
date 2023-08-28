package com.techFusionNexus.services;

import java.util.List;

import com.techFusionNexus.entities.Course;
import com.techFusionNexus.entities.Lesson;

public interface TrainerService {
	String addCourse(Course course);
	List<Course> fetchAllCourses();
	String addLesson(Lesson lesson);
	String saveCourse(Course course);
}
