package entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private Item item;
    private Double money;

    public Inventory() {
    }

    public Inventory(Item item) {
        this.item = item;
    }

    public Inventory(Double money) {
        this.money = money;
    }

    public Inventory(Item item, Double money) {
        this.item = item;
        this.money = money;
    }

    List<Item> itemList = new ArrayList<>();

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }

}
