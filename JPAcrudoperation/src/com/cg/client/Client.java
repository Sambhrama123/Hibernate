package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {
StudentService service = new StudentServiceImpl();

Student student = new Student();

//Create
student.setStudentId(100);
student.setName("Sachin");
service.addStudent(student);

//Retrieve
student = service.findStudentById(100);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName());

//Update
student = service.findStudentById(100);
student.setName("Sachin Tendulkar");
service.updateStudent(student);

//Retrieve
student = service.findStudentById(100);
System.out.print("ID:"+student.getStudentId());
System.out.println(" Name:"+student.getName());

/*
 * //Delete student = service.findStudentById(100);
 * service.removeStudent(student);
 * System.out.println("End of program/Life cycle completed...");
 */

}
}
