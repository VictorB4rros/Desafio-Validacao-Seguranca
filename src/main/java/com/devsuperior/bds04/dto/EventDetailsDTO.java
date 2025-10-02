package com.devsuperior.bds04.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.bds04.projections.EventProjection;

public class EventDetailsDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private LocalDate date;
	private String url;
	private String cityName;
	
	public EventDetailsDTO() {
	}
	
	public EventDetailsDTO(EventProjection projection) {
		id = projection.getId();
		name = projection.getName();
		date = projection.getDate();
		url = projection.getUrl();
		cityName = projection.getCityName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
