package com.sudarshan.sud.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.sudarshan.sud.entities.Project;

@Service
public interface ProjectRepository extends CrudRepository<Project, Long> {

	@Override
	public List<Project> findAll();
}
