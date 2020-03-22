package com.biat.pillingservice;

import com.biat.pillingservice.Model.Bill;
import com.biat.pillingservice.Model.ProductItem;
import com.biat.pillingservice.Repository.BillRepository;
import com.biat.pillingservice.Repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class PillingServiceApplication implements CommandLineRunner {
     @Autowired
	BillRepository billRepository;
     @Autowired
	ProductItemRepository productItemRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(PillingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Bill.class);
		repositoryRestConfiguration.exposeIdsFor(ProductItem.class);
	Bill b1=	billRepository.save(new Bill(null,new Date(),1L,null));
		//Bill b2=new Bill(null,new Date(),2L,null);
		productItemRepository.save(new ProductItem(null,1L,100.01,3,b1));
		productItemRepository.save(new ProductItem(null,1L,150.01,10,b1));


	}
}
