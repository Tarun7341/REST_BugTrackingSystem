package com.example.demo.model;

import java.util.List;

//import org.apache.catalina.realm.JNDIRealm.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Project {
	
	@Id
	private Integer id;
	private String name;
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="project", cascade=CascadeType.ALL)
	private List<Ticket> tickets;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="project", cascade=CascadeType.ALL)
	private List<User> members;
}
