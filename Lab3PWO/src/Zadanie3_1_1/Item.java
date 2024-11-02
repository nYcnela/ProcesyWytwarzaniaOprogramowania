package Zadanie3_1_1;

public class Item {
    private String name;
    private int price;
    private int status;

    public final int STATUS_NEW = 0;
    public final int STATUS_SOLD = 1;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
        this.status = STATUS_NEW;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Item produceItem(String name, int price){
        return new Item(name, price);
    }

}

