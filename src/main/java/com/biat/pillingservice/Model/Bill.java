package com.biat.pillingservice.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@ToString
public class Bill{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDteCreaction;
    private Long customerID;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;

    public Bill() {
    }
    public Bill(Long id,Date billingDteCreaction,Long customerID,Collection<ProductItem> productItems ) {
        this.id=id;
        this.customerID=customerID;
        this.productItems=productItems;
    }



}
