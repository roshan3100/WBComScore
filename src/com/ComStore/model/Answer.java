package com.ComStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="answer")
public class Answer { 

	@Id
	@Column(name="id")
	private int id;  
	
	@Column(name="answer_name")
	private String answername;  
	
	@Column(name="posted_by")
	private String postedby; 
	
	@ManyToOne
	@JoinColumn(name="question_id", nullable=false)
	private Answer ans;
	
	public Answer() {}  
	
	public Answer(int id, String answername, String postedby) {  
	    super();  
	    this.id = id;  
	    this.answername = answername;  
	    this.postedby = postedby;  
	}  
	
	public int getId() {  
		return id;  
	}  
	public void setId(int id) {  
		this.id = id;  
	}  
	public String getAnswername() {  
		return answername;  
	}  
	public void setAnswername(String answername) {  
		this.answername = answername;  
	}  
	public String getPostedby() {  
		return postedby;  
	}  
	public void setPostedby(String postedby) {  
		this.postedby = postedby;  
	}  

}  
