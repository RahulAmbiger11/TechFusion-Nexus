package com.techFusionNexus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techFusionNexus.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{
	//modification
	Lesson findByLessonId(int lessonId);
	

}
