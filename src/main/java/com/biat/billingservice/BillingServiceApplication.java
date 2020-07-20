package com.biat.billingservice;

import java.util.Date;

import org.apache.http.util.Args;
import org.hibernate.service.spi.Startable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.biat.billingservice.model.Bill;
import com.biat.billingservice.model.Customer;
import com.biat.billingservice.model.ProductItem;
import com.biat.billingservice.repository.BillRepository;
import com.biat.billingservice.repository.CustomerService;
import com.biat.billingservice.repository.ProductItemRepository;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(BillRepository billRepository,ProductItemRepository itemRepository,
			RepositoryRestConfiguration repositoryRestConfiguration,CustomerService customerService)
	{
		
		return Args ->{
			repositoryRestConfiguration.exposeIdsFor(Bill.class);
			repositoryRestConfiguration.exposeIdsFor(ProductItem.class);
		Bill bill=	billRepository.save(new Bill(null,new Date(),1L,null));
	Bill bill2=		billRepository.save(new Bill(null,new Date(),2L,null));
			billRepository.save(new Bill(null,new Date(),1L,null));
			billRepository.save(new Bill(null,new Date(),3L,null));
			billRepository.save(new Bill(null,new Date(),2L,null));
			billRepository.save(new Bill(null,new Date(),13L,null));
			//billRepository.findAll().forEach(System.out::println);
			System.out.println("-------------------------------------------------------------");
			itemRepository.save(new ProductItem(null, 100.2, 200, 1L, bill));
			
			itemRepository.save(new ProductItem(null, 90.2, 180, 1L, bill2));
		Customer customer=customerService.findCustomerById(1L);
		System.out.println("------------------------");
		
		System.out.println("------------EMAIL------------"+customer.getEmail());
		System.out.println("------------NAME------------"+customer.getName());
		System.out.println("------------EMAIL------------"+customer.getId());
		
		};
	}

}
