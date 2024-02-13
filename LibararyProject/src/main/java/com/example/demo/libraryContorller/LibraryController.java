package com.example.demo.libraryContorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.libararyDaoImple.LibararyDaoImple;

@RestController
public class LibraryController {
	
	@Autowired
	LibararyDaoImple dapImple;
	
	@PostMapping("/savelibarary")
	public StudentEntity studentsave(@RequestBody StudentEntity stu) {
		return dapImple.saverecords(stu);
		
	}

}
