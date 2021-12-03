package com.lti.jpaDemos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Defining the table Structure

@Table(name="zphs") //Giving Table Name, if not Class name will be as Table name
public class Student {
	
	@Id //its like primary key //variables names are the colmn names
	
	@Column(name="StudentId")
	private int studId;
	@Column(name="StuName")
	private String stdName;
	@Column(name="StuScore1212")
	private double score;
	public Student(int studId, String stdName, double score) {
		super();
		this.studId = studId;
		this.stdName = stdName;
		this.score = score;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", stdName=" + stdName + ", score=" + score + "]";
	}
	
}
