package com.springstudent.cruddemo;

import com.springstudent.cruddemo.dao.StudentDAO;
import com.springstudent.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){

//		uncomment method below to see how it works.

		return runner ->
			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudent(studentDAO);
//			queryForStudentByLastname(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudent(studentDAO);
	}

	private void deleteAllStudent(StudentDAO studentDAO) {

//		delete all students
		System.out.println("Deleting all students");
		int rowsDeleted = studentDAO.deleteAll();

//		print row deleted
		System.out.println("Deleted row count: " + rowsDeleted);


	}

	private void deleteStudent(StudentDAO studentDAO) {

//		get studentID
		int studentId = 2;

//		delete student from database
		System.out.println("Deleting student id: "+ studentId);

		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDAO studentDAO) {

//		retrieve student based on id
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);

		Student myStudent = studentDAO.findById(studentId);
		System.out.println("Updating student...");

//		change first name to "Scooby
		myStudent.setFirstName("Scooby");
		studentDAO.update(myStudent);

//		display updated student
		System.out.println("Updated student: " + myStudent);

	}


	private void queryForStudentByLastname(StudentDAO studentDAO) {

//		get list of students
		List<Student> theStudents = studentDAO.findByLastName("Doe");

//		display students
		for (Student tempStudent:
			 theStudents) {
			System.out.println(tempStudent);
		}

	}

	private void queryForStudent(StudentDAO studentDAO) {

//		get list of students
		List<Student> theStudents = studentDAO.findAll();

//		display list of students
		for (Student tempStudent:
			  theStudents) {
			System.out.println(tempStudent);
		}

	}

	private void readStudent(StudentDAO studentDAO) {

//		create object
		System.out.println("Creating new object");
		Student newStd = new Student("dave", "evad", "dave@gmail.com");

//		save student object
		System.out.println("Saving object in database");
		studentDAO.save(newStd);

//		display id of the saved student
		System.out.println("newStudent id:" + newStd.getId());

//		retrieve student object
		System.out.println(studentDAO.findById(newStd.getId()));



	}

	private void createStudent(StudentDAO studentDAO) {

//		create student
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("lORA", "Doe", "paul@email.com");

//		save student in database
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

//		get the registered student's id
		System.out.println("saved student. Generated id:" + tempStudent.getId());

	}

}
