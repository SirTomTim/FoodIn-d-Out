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
public class CaloIntake {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long inId;
    private String food;
    private int calorIN;
    private String dateI;
    
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "timeID")
    private Time time;
    
    public CaloIntake() {}
    
    public CaloIntake(String food, int calorIN, String dateI, Time time) {
    	super();
    	this.food = food;
    	this.calorIN = calorIN;
    	this.dateI = dateI;
    	this.time = time;
    	
    	
    }

	public String getDateI() {
		return dateI;
	}

	public void setDateI(String dateI) {
		this.dateI = dateI;
	}

	public Long getInId() {
		return inId;
	}

	public void setInId(Long inId) {
		this.inId = inId;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getCalorIN() {
		return calorIN;
	}

	public void setCalorIN(int calorIN) {
		this.calorIN = calorIN;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		if (this.time != null)
		return "CaloIntake [inId=" + inId + ", food=" + food + ", calorIN=" + calorIN + ", dateI=" + dateI + ", time="
				+ time + "]";
		else
			return"CaloIntake [inId=" + inId + ", food=" + food + ", calorIN=" + calorIN + ", dateI=" + dateI + "]";
	}
    
    
}
