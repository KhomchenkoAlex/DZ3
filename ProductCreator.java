package DZ3; /**
 * Created by alex on 07.11.16.
 */
import DZ3.Product;

import java.util.*;

public class ProductCreator {
    Scanner inName = new Scanner(System.in);
    Scanner inPrice = new Scanner(System.in);
    Scanner inQuantity = new Scanner(System.in);

    String inputName(){
        System.out.println("Please, enter the name of product:");
        String name = inName.nextLine();
        return name;
    }

    float inputPrice(){
        System.out.println("Please, enter the price of product:");
        float price = inPrice.nextFloat();
        return price;
    }

    int inputQuantity(){
        System.out.println("Please, enter the quantity of product:");
        int quantity = inQuantity.nextInt();
        return quantity;
    }

    public Product createProduct(){
        return new Product(inputName(), inputPrice(), inputQuantity());

    }
}
