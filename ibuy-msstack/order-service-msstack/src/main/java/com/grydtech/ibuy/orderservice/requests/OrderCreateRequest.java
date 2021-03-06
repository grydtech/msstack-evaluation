package com.grydtech.ibuy.orderservice.requests;

import com.grydtech.ibuy.orderservice.entities.OrderEntity;
import com.grydtech.msstack.core.types.messaging.Command;

import java.util.UUID;

public class OrderCreateRequest extends Command<OrderEntity> {

    private String orderId;
    private String customerId;
    private Double amount;

    public OrderCreateRequest() {
    }

    public OrderCreateRequest(String orderId, String customerId, Double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public UUID getEntityId() {
        return UUID.fromString(this.orderId);
    }

    @Override
    public Class<OrderEntity> getEntityClass() {
        return OrderEntity.class;
    }
}
