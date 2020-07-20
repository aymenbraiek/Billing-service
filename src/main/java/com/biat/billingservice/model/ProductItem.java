package com.biat.billingservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class ProductItem  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2882019890813888650L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double price;
	private int quantity;
	private Long productID;
	@ManyToOne
    private Bill bill;
	
	public ProductItem(Long id, Double price, int quantity, Long productID, Bill bill) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.productID = productID;
		this.bill = bill;
	}
	public ProductItem() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
