package Zadanie3_1_1;

import java.util.ArrayList;

public class Storage {
    ArrayList<Item> items = new ArrayList<>();

    public final int STATUS_NEW = 0;
    public final int STATUS_SOLD = 1;

    public void addItemToStorage(Item item){
        items.add(item);
    }
    public void removeItemFromStorage(Item item){
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void sellItemFromStorage(int storageIndex){
        Item item = items.get(storageIndex);
        item.setStatus(STATUS_SOLD);
    }

}
