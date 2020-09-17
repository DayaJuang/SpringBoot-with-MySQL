package io.daya.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Override
	List<Student> findAll();
	
	public Student findByName(String name);

}
