package io.daya.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll(){
		return studentRepository.findAll();
		}
	
	public Student getStudentByName(String name) {
		return studentRepository.findByName(name);
	}
	
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "Saved!";
	}
	
	public String updateStudent(int id, Student student) {
		studentRepository.save(student);
		return "Updated!";
	}
	
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "deleted!";
	}
}
