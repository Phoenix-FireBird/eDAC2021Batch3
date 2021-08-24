package com.phoenix.demos;

public class ProjectManager extends Employee {

	int teamSize;
	
	public ProjectManager() {
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(int v1, String v2, int teamSize) {
		super(v1, v2);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
}
