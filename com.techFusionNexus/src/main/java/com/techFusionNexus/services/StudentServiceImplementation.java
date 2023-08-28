package com.techFusionNexus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techFusionNexus.entities.Course;
import com.techFusionNexus.entities.Lesson;
import com.techFusionNexus.repositories.CourseRepository;
import com.techFusionNexus.repositories.LessonRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	CourseRepository repo;
	
	@Autowired
	LessonRepository lrepo;
	
	@Override
	public List<Course> fetchCourseList() {
		return repo.findAll();
	}
	@Override
	public Course fetchCourse(int courseId) {
		return repo.findByCourseId(courseId);
	}
	
	//modification
	@Override
	public Lesson getLesson(int lessonId) {
		return lrepo.findByLessonId(lessonId);
		
	}

}
