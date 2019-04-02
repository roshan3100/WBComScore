package com.ComStore.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="question")
public class Question {
	
	@Id
	@Column(name="id")
	private int id; 
	
	@Column(name="question_name")
	private String questionname; 
	
	@Column(name="creation_date")
	private String creation_date;
	
	@Column(name="report_date")
	private String report_date;

	@OneToMany(mappedBy="ans")
	private List<Answer> answers;
	
	public Question() {
		
	}
	
	public Question(int id, String report_date,String creation_date,String questionname, List<Answer> answers) {  
	    super();  
	    this.id = id;  
	    this.report_date=report_date;
	    this.creation_date=creation_date;
	    this.questionname = questionname;  
	    this.answers = answers;  
	}  
	
	
	@XmlAttribute 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement 
	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}
	
	@XmlElement 
	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	@XmlElement
	public String getReport_date() {
		return report_date;
	}

	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}

	@XmlElement 
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}


}

