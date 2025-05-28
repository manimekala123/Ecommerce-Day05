package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController extends CURDController<String, Student> {
	Student Bob = new Student("2020IT01", "Bob Marely", 23, "IT", 3.2);
	Student Alice = new Student("2020IT02", "Alice corner", 24, "IT", 3.6);
	Student John = new Student("2020IT03", "John Parker", 23, "IT", 3.3);

	public StudentController() {	
		getMap().put(Alice.getRegNo(), Alice);
		getMap().put(Bob.getRegNo(), Bob);
		getMap().put(John.getRegNo(), John);
	}

	

}
