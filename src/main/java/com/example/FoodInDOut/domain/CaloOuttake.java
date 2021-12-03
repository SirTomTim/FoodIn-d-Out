package com.example.FoodInDOut.domain;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CaloOuttake {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long outId;
    private String sport;
    private String dateO;
    private int calOUT;
    private String timeO;
    
    @JsonIgnore
    
    
    
    public CaloOuttake() {}
    
    public CaloOuttake(String sport, int calOUT, String dateO, String timeO) {
    	super();
    	this.sport = sport;
    	this.calOUT = calOUT;
    	this.dateO = dateO;
    	this.timeO = timeO;
    	
    }

	public Long getOutId() {
		return outId;
	}

	public void setOutId(Long outId) {
		this.outId = outId;
	}

	public String getDateO() {
		return dateO;
	}

	public void setDateO(String dateO) {
		this.dateO = dateO;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getCalOUT() {
		return calOUT;
	}

	public void setCalOUT(int calOUT) {
		this.calOUT = calOUT;
	}

	public String getTimeO() {
		return timeO;
	}

	public void setTimeO(String timeO) {
		this.timeO = timeO;
	}

	@Override
	public String toString() {
		if (this.timeO != null)
		return "CaloOuttake [outId=" + outId + ", sport=" + sport + ", dateO=" + dateO + ", calOUT=" + calOUT
				+ ", time==" + timeO + "]";
		else
		return "CaloOuttake [outId=" + outId + ", sport=" + sport + ", dateO=" + dateO + ", calOUT=" + calOUT
				+ "]";
				
	}
    
    

}
