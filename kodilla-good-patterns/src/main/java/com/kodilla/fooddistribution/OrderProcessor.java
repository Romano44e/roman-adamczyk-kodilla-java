package com.kodilla.fooddistribution;

public class OrderProcessor {

    private OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.orderFood(orderRequest.getSupplier(), orderRequest.getUser());

        if (isOrdered) {
            System.out.println("Order has been successfully processed!" );
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Order has not been processed!" );
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
