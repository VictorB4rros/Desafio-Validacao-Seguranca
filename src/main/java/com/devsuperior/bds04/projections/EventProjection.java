package com.devsuperior.bds04.projections;

import java.time.LocalDate;

public interface EventProjection {

	Long getId();
	String getName();
	LocalDate getDate();
	String getUrl();
	String getCityName();
}
