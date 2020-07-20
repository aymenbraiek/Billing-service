package com.biat.billingservice.repository;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.biat.billingservice.model.Bill;

@Projection(name = "p3",types = Bill.class)
public interface BillProjection {
	
	public Long getId();
	public static final Date getDateCreaction = new Date();


}
