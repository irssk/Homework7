package app;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CoffeeOrderBoard {
    private final List<Order> orders = new LinkedList<>();
    private int nextOrderNumber = 1;

    public void add(String name) {
        orders.add(new Order(nextOrderNumber++, name));
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            throw new IllegalStateException("No orders to deliver!");
        }
        return orders.remove(0);
    }

    public Order deliver(int orderNumber) {
        Optional<Order> orderToDeliver = orders.stream()
                .filter(order -> order.getNumber() == orderNumber)
                .findFirst();

        if (orderToDeliver.isEmpty()) {
            throw new IllegalArgumentException("Order number " + orderNumber + " not found!");
        }

        orders.remove(orderToDeliver.get());
        return orderToDeliver.get();
    }
}