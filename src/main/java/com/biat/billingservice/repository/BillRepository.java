package com.biat.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.biat.billingservice.model.Bill;
@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, Long>{

}
