package com.sixdelta.alvacovaco.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task", catalog = "springboot_alfonsovaco")
public class Task implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id")
	private int id;
	@Basic(optional = false)
	@Column(name="description")
	private String description;
	@Basic(optional = false)
	@Column(name="dateCreated")
	private Date dateCreated;
	@Basic(optional = false)
	@Column(name="lastUpdate")
	private Date lastUpdate;
	@Basic(optional = false)
	@Column(name="finished")
	private boolean finished;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	public boolean isFinished() {
		return finished;
	}
	
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	public Task(int id, String description, Date dateCreated, Date lastUpdate, boolean finished) {
		super();
		this.id = id;
		this.description = description;
		this.dateCreated = dateCreated;
		this.lastUpdate = lastUpdate;
		this.finished = finished;
	}
	
	public Task() {}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", dateCreated=" + dateCreated + ", lastUpdate="
				+ lastUpdate + ", finished=" + finished + "]";
	}
	
	

}
