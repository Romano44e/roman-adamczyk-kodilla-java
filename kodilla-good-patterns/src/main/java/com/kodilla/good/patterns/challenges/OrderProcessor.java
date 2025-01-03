package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private OrderService OrderService;
    private InformationService informationService;

    public OrderProcessor(OrderService OrderService , InformationService informationService) {
        this.OrderService = OrderService;
        this.informationService = informationService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = OrderService.orderProduct(orderRequest.getSupplier(), orderRequest.getUser());

        if (isOrdered) {
            System.out.println("Order has been successfully processed!" );
            informationService.informAboutOrder(orderRequest.getSupplier(), orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Order has not been processed!" );
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
