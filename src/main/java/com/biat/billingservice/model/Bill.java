package com.biat.billingservice.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Bill  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8542313666665231445L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDteCreaction;
    private Long customerID;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
	public Bill(Long id,Date billingDteCreaction, Long customerID, Collection<ProductItem> productItems) {
		super();
		this.id=id;
		this.billingDteCreaction = billingDteCreaction;
		this.customerID = customerID;
		this.productItems = productItems;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    

}
