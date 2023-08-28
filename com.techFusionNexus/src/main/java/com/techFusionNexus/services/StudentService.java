package com.techFusionNexus.services;

import java.util.List;

import com.techFusionNexus.entities.Course;
import com.techFusionNexus.entities.Lesson;

public interface StudentService {
	List<Course> fetchCourseList();
	Course fetchCourse(int courseId);
	
	//modification
	Lesson getLesson(int lessonId);

}
