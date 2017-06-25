package com.practice.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring","spring-framework","spring-framework-boot"),
//			new Topic("java","java-language","java-description")
//			));
	
	public List<Course> getAllCourses(){
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course, String id) {
//		for(int i=0; i< topics.size(); i++){
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.set(i, topic);
//				return;
//			}
//			
//		}
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		courseRepository.delete(id);
	}
}
