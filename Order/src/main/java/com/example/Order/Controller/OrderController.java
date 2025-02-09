package com.example.Order.Controller;

import com.example.Order.Service.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OrderPage")
public class OrderController {

    OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer)
    {
        this.orderProducer=orderProducer;
    }

    @PostMapping("/Order")
    public String placeOrder(@RequestParam("message") String message)
    {
        orderProducer.sendMessage("Order",message);
        return "Order is placed";
    }


}
