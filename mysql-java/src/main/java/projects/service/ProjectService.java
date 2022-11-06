package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	// calls DAO class in order to insert project row
	
	
	public Project addProject(Project project) {
		return projectDao.insertProject (project);
		
	}

}
