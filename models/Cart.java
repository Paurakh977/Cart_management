package models;

public class Cart {
    String shopname;
    int id;
    int [] item_price;
    String [] items;

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public Cart(int id, String shopname, int[] item_price, String[]items){
        this.id=id;
        this.shopname=shopname;
        this.item_price=item_price;
        this.items=items;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getItem_price() {
        return item_price;
    }

    public void setItem_price(int[] item_price) {
        this.item_price = item_price;
    }
}
