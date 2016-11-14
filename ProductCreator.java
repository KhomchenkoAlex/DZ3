package DZ3; /**
 * Created by alex on 07.11.16.
 */
import DZ3.Product;

import java.util.*;

public class ProductCreator {
    Scanner input = new Scanner(System.in);


    String inputName(){
        System.out.println("Please, enter the name of product:");
        String name = input.nextLine();
        return name;
    }

    float inputPrice(){
        System.out.println("Please, enter the price of product:");
        float price = input.nextFloat();
        return price;
    }

    int inputQuantity(){
        System.out.println("Please, enter the quantity of product:");
        int quantity = input.nextInt();
        return quantity;
    }

    public Product createProduct(){
        return new Product(inputName(), inputPrice(), inputQuantity());

    }
}
