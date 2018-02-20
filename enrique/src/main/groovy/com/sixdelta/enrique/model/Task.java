package com.sixdelta.enrique.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer iD;
	private String description;
	private Date dateCreated;
	private Date lastUpdate;
	private boolean actual;
	
}
