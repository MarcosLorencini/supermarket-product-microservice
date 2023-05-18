package com.supermarket.product.microservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.supermarket.product.microservice.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;

public class TicketServiceImpl implements TicketService{

    @Autowired
    @LoadBalanced
    RestTemplate restTemplate;


    @Override
    @HystrixCommand(fallbackMethod = "defaulTicket")
    public Ticket findByProductId(Integer productId) {
        return restTemplate.getForObject("http://TICKET-SERVICE/ticket/product/{productId}", Ticket.class, productId);
    }

    private Ticket defaulTicket(Integer productId) {
        return new Ticket();
    }
}
