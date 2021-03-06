package com.biat.billingservice;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.biat.billingservice.model.Product;

@FeignClient(name="INVENTORY-SERVICE")
public interface InventoryService {
	@GetMapping("/products/{id}")
	public Product findroductById(@PathVariable(name="id") Long id);
	
	
	@GetMapping("/products")
	public PagedModel<Product> findAllProducts();
}
