package com.practice.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses",method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course){
		courseService.addCourse(course);
		
	}
	
	@RequestMapping(value="/topics/{topicId}/courses/{id}",method=RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course,@PathVariable String id){
		courseService.updateCourse(course, id);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses/{id}",method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String id){
		 courseService.deleteCourse(id);
	}

}
