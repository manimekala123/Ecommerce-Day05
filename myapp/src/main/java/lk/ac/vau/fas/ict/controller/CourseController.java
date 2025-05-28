package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Course;

@RestController
@RequestMapping("/course")
public class CourseController extends CURDController<String, Course> {
	
	public CourseController() {
		Course ecommerce = new Course("IT3232", "Practical for E-commerce", 2);
		Course webservice = new Course("IT2234", "Web Service and server technologies", 3);
		Course webapplication = new Course("CSC3132", "Web Application Development", 3);
		getMap().put(webapplication.getCode(), webapplication);
		getMap().put(webservice.getCode(), webservice);
		getMap().put(ecommerce.getCode(), ecommerce);
	}

	

}
