package com.sudarshan.sud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sudarshan.sud.dao.ProjectRepository;
import com.sudarshan.sud.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	ProjectRepository prjRep;
	
	@RequestMapping("/new")
	public String displayProjectForm(Model model) {
		Project aproject = new Project();
		model.addAttribute("project",aproject);
		return "new-project";
	}
	
	@RequestMapping("/save")
	public String createProject(Project project,Model model) {
		prjRep.save(project); 
		return "redirect:/projects/new";
	}
	
}
