package com.supermarket.product.microservice.service;

import com.supermarket.product.microservice.domain.Ticket;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//passando o nome do microserviço registrado no eureka service,
// desta forma o Feign vai reconhecer este serviço e poderá executar operações nele.
@FeignClient(name="ticket-service")
public interface TicketService {

    //Com a anotação abaixo enviamos a requisição passando o produto id
    // para o serviço ticketService e obtemos como retorno um ticket
    @GetMapping(value = "/ticket/product/{productId}")
    Ticket findByProductId(@PathVariable ("productId") Integer productId);
}
