package com.biat.billingservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	@Transient
	private Product product;
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Long getProductID() {
		return productID;
	}
	public void setProductID(Long productID) {
		this.productID = productID;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}

    
}
