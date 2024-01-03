package models;

public class Order {
    public Cart my_carts;
    public Order(Cart my_carts){
        this.my_carts=my_carts;
    }
    public void display_total(){
        int[] item_price=this.my_carts.getItem_price();
        int id=this.my_carts.getId();
        String shop_name=this.my_carts.getShopname();
        String [] items=this.my_carts.getItems();
        System.out.println("shop_id "+id+"\t\t\t\t\t\t\t Shop_Name: "+shop_name+"\n");
        for (int i = 0; i < items.length ; i++) {
            int total=0;
            System.out.println(" item: "+ items[i]+ " price: "+ item_price[i]);
        }
    }
}
