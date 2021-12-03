package com.example.FoodInDOut.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Time {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long timeID;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "time")
	private List<CaloIntake> intake;
	
	public Time() {}
	
	public Time(String name) {
		super();
		this.name = name;
	}

	public Long getTimeID() {
		return timeID;
	}

	public void setTimeID(Long timeID) {
		this.timeID = timeID;
	}

	public String getTime() {
		return name;
	}

	public void setDate(String name) {
		this.name =name;
	}

	public List<CaloIntake> getIntake() {
		return intake;
	}

	public void setIntake(List<CaloIntake> intake) {
		this.intake = intake;
	}





	

}
