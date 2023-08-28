package com.techFusionNexus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techFusionNexus.entities.Course;
import com.techFusionNexus.entities.Lesson;
import com.techFusionNexus.repositories.CourseRepository;
import com.techFusionNexus.repositories.LessonRepository;

@Service
public class TrainerServiceImplementation implements TrainerService {

	@Autowired
	CourseRepository repo;
	@Autowired
	LessonRepository lrepo;
	@Override
	public String addCourse(Course course) {
		repo.save(course);
		return "course added";
	}
	@Override
	public List<Course> fetchAllCourses() {
		return repo.findAll();
	}
	@Override
	public String addLesson(Lesson lesson) {
		lrepo.save(lesson);
		return "lesson added";
	}
	@Override
	public String saveCourse(Course course) {
		repo.save(course);
		return "course updated";
	}

}
