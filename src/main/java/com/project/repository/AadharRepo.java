package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Aadhar;

public interface AadharRepo extends JpaRepository<Aadhar, Integer> {
	Aadhar findByAnum(long anum);
}
