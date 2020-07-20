package com.biat.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.biat.billingservice.model.ProductItem;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long>{

}
