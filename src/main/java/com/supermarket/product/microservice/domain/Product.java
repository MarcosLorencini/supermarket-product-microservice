package com.supermarket.product.microservice.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Table(name = "PRODUCT")
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id//Pk
    @Column(name="PRODUCTID")
    Integer productId;

    @Column(name="PRODUCTNAME")
    String productName;

    // etre atributo não será utilizada no bd. Não será feito o mapeamento obj relacional pode vir nulo.
    @Transient
    Ticket ticket;

    public Product() {
        super();
    }

    public Product(Integer productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
