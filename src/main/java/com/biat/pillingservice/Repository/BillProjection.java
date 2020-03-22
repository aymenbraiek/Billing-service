package com.biat.pillingservice.Repository;

import com.biat.pillingservice.Model.Bill;
import com.biat.pillingservice.Model.ProductItem;
import org.springframework.data.rest.core.config.Projection;

import java.util.Collection;
import java.util.Date;

@Projection(name="billfull",types= Bill.class)
public interface BillProjection {
    Long getId();
    Date getDateFacture();
    Long getCustomerId();
    Collection<ProductItem> getProductItems();
}
