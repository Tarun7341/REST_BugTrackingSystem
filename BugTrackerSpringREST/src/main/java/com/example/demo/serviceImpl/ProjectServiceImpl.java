package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.model.Ticket;
import com.example.demo.model.User;
import com.example.demo.repository.ProjectRepository;
import com.example.demo.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectrepository;
	
	@Override
	public List<Project> getAll() {
		return (List<Project>) projectrepository.findAll();
	}

	@Override
	public void Update(Project project) {
		projectrepository.save(project);
	}

	@Override
	public void addNew(Project project) {
		System.out.print(project);
		projectrepository.save(project);
		
	}

	@Override
	public Optional<Project> getOne(Integer id) {
		return projectrepository.findById(id) ;
	}

	@Override
	public void delete(Integer id) {
		projectrepository.deleteById(id);
		
	}
	
	public List<Ticket> getTicketsByProject(Integer id){
		return projectrepository.getTicketsByProject(id);
	}
	
	public List<User> getMembersByProject(Integer id){
		return projectrepository.getMembersByProject(id);
	} 
	

}
