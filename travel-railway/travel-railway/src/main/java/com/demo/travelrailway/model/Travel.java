package com.demo.travelrailway.model;

import java.io.Serializable;

public class Travel implements Serializable{


	private String type;
	private String weekDay;
	private String source;

	public Travel() {
	}

	public Travel(String type, String weekDay, String source) {
		super();
		this.type = type;
		this.weekDay = weekDay;
		this.source = source;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}



}
