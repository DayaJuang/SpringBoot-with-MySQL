package io.daya.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/allStudents")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@RequestMapping("student/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
	}
	
	@PostMapping("/student/add")
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PutMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable int id,@RequestBody Student student) {
		return studentService.updateStudent(id,student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}

}
