package com.supermarket.product.microservice.domain;

import java.io.Serializable;

public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    Integer ticketId;

    Integer winningNumber;

    String status;


    public Ticket() {
        super();
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(Integer winningNumber) {
        this.winningNumber = winningNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
