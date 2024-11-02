package Zadanie3_1_2;

import java.util.Random;

public class Bill {
    private int totalBill;
    private Order order;

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill){
        this.totalBill = totalBill;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }

    public void calculateBill(){
        Random rand = new Random();
        final int[] totalAmt = {0};
        order.getOrderItems().forEach(item -> {
            totalAmt[0] += rand.nextInt(100) * item.getQuantity();
        });
        setTotalBill(totalAmt[0]);
        System.out.println("Zamowienie z id  "
                + getOrder().getOrderId()
                + ", calkowita kwota rachunku wynosi "
                + getTotalBill());
    }

}
