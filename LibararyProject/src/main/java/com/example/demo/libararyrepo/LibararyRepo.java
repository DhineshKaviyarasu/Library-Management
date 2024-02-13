package com.example.demo.libararyrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;

@Repository
public interface LibararyRepo extends JpaRepository<StudentEntity, Integer> {

}
