package DZ3;

/**
 * Created by alex on 07.11.16.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void showProduct(){
         System.out.format("Name of product - %s price - %.3f quantity - %d %n", name, price, quantity);
     }
}
