package com.biat.billingservice.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biat.billingservice.model.Bill;
import com.biat.billingservice.repository.BillRepository;

@RestController
@RequestMapping("/biat")
public class BillController {
@Autowired
BillRepository  billrepository;
	
	@GetMapping("/list")
	Collection<Bill> getAllBills()
	{
		return billrepository.findAll();
	}
}
