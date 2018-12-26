package com.ntl.model;

public class Project {

	private int projId;
	private String projName;
	/**
	 * 
	 */
	public Project() {
		super();
	}
	/**
	 * @return the projId
	 */
	public int getProjId() {
		return projId;
	}
	/**
	 * @param projId the projId to set
	 */
	public void setProjId(int projId) {
		this.projId = projId;
	}
	/**
	 * @return the projName
	 */
	public String getProjName() {
		return projName;
	}
	/**
	 * @param projName the projName to set
	 */
	public void setProjName(String projName) {
		this.projName = projName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + "]";
	}

	
	
	
}
