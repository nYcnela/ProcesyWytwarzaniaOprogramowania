package Zadanie3_1_2;

import java.util.List;
import java.util.Random;

public class Order {
    private String orderId;
    private List<Item> orderItems;

    public Order(String orderId) {
        setOrderId(orderId);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId){
        Random random = new Random();
        this.orderId = orderId + "-" + random.nextInt(100);
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }

    public void setItems(List<Item> items) {
        this.orderItems = items;
    }
}
