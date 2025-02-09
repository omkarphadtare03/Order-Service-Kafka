package com.example.Order.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Order {

    String Id;
    String productname;
    Long  price;

}
