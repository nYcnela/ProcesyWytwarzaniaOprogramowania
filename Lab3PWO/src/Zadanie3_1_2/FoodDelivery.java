package Zadanie3_1_2;

public class FoodDelivery {
    private Order order;
    private Customer customer;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void prepareOrder(){
        System.out.println(
                "Preparing order for customer - " +
                        getCustomer().getCustomerName()
                        + " who has ordered ");
        for (Item item : getOrder().getOrderItems()) {
            System.out.println(item.getItemName());
        }
    }

    public void delivery(){
        System.out.println("Delivering the order for Customer " +  getCustomer().getCustomerName());
        System.out.println("Order with order id as " + getOrder().getOrderId() + " being delivered.");
        System.out.println( "Order is to be delivered to: " + getCustomer().getCustomerAddress());
    }
}

