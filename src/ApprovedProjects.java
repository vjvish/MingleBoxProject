

import java.util.ArrayList;

public class ApprovedProjects extends Project {
	ArrayList<Project>projectForCoder=new ArrayList<>();
	ArrayList<Project>projectForBuyer=new ArrayList<>();
	public ArrayList<Project> getProjectForCoder() {
		return projectForCoder;
	}
	public void setProjectForCoder( Project  projectForCoder) {
		this.projectForCoder.add(projectForCoder) ;
	}
	public ArrayList<Project> getProjectForBuyer() {
		return projectForBuyer;
	}
	public void setProjectForBuyer( Project  projectForBuyer) {
		this.projectForBuyer.add(projectForBuyer);
	}
	

}
