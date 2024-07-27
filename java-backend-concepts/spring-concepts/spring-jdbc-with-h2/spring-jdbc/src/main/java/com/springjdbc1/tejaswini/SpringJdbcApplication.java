package com.springjdbc1.tejaswini;

import com.springjdbc1.tejaswini.model.Student;
import com.springjdbc1.tejaswini.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(103);
		s.setName("wini");
		s.setMarks(90);

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(s);

		List<Student> students = studentService.getAllStudents();
		System.out.println(students);
	}

}
