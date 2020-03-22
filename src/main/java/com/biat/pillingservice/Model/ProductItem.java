package com.biat.pillingservice.Model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
public class ProductItem {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Long productId;
    private Double price;
    private int quantity;
    @ManyToOne
    private Bill bill;

    public ProductItem() {
    }

    public ProductItem(Long id,long productId,double price,int quantity ,Bill bill) {
        this.id=id;
        this.productId=productId;
        this.price=price;
        this.quantity=quantity;
        this.bill=bill;
    }
}
