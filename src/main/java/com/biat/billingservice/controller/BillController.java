package com.biat.billingservice.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biat.billingservice.CustomerService;
import com.biat.billingservice.InventoryService;
import com.biat.billingservice.model.Bill;
import com.biat.billingservice.model.Customer;
import com.biat.billingservice.repository.BillRepository;
import com.biat.billingservice.repository.ProductItemRepository;

@RestController
@RequestMapping("/biat")
public class BillController {
@Autowired
BillRepository  billrepository;
@Autowired
private ProductItemRepository productItemRepository;
@Autowired
private CustomerService customerService;
@Autowired
private InventoryService inventoryService;


@GetMapping("/fullBill/{id}")
public Bill getBill(@PathVariable(name = "id") Long id)
{
	//facture qui contient tous les details 
	Bill bill=billrepository.findById(id).get();
	bill.setCustomer(customerService.findCustomerById(bill.getCustomerID()));
	bill.getProductItems().forEach(pi->{
		pi.setProduct(inventoryService.findroductById(pi.getProductID()));
	});
	return bill;
}
	


}
