package DZ3;

import DZ3.Product;

import java.util.*;

/**
 * Created by alex on 07.11.16.
 */
public class Storage {
    LinkedList<Product> productlist = new LinkedList<Product>();

    void initStorage() {
        productlist.add(new Product("Spam", 47, 3));
        productlist.add(new Product("Beer", 18, 5));
        productlist.add(new Product("Chips", 21, 2));
    }

    void addProductToStorage(Product e){
        productlist.add(e);
    }
    String inputName(){
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        return name;
    }

    double calculateCostOf(String s){
        double cost = 0;
        for(Product i: productlist){
            if(i.getName().equals(s))
                cost += (i.getPrice()*i.getQuantity());
            }
        return cost;
        }

    int calculateAmountOf(String s){
        int amount = 0;
        for(Product i: productlist){
            if(i.getName().equalsIgnoreCase(s))
                amount += i.getQuantity();
        }
        return amount;
    }

    void showTheStorage(){
        for (int i = 0; i < productlist.size(); i++) {
            productlist.get(i).showProduct();
        }
    }

}
