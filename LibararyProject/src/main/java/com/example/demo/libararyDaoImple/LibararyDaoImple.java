package com.example.demo.libararyDaoImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.libararyDao.LibararyDao;
import com.example.demo.libararyrepo.LibararyRepo;

@Service
public class LibararyDaoImple implements LibararyDao{
	
	@Autowired
	LibararyRepo repo;

	@Override
	public StudentEntity saverecords(StudentEntity s) {
		// TODO Auto-generated method stub
		return repo.save(s);
	}

}
