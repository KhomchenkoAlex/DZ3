package DZ3;

import java.util.*;

/**
 * Created by alex on 07.11.16.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ProductCreator PC = new ProductCreator();
        Storage S = new Storage();
        S.initStorage();

        while (true) {
            System.out.println(
                    "1. Add the product in the storage\n" +
                            "2. Show products in the storage\n" +
                            "3. Calculate the cost of the chosen product in the storage\n" +
                            "4. Calculate the quantity of the chosen product in the storage\n" +
                            "0.Exit\n");

            switch (input.nextInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    S.addProductToStorage(PC.createProduct());
                    break;
                case 2:
                    S.showTheStorage();
                    break;
                case 3:
                    System.out.println("Please, enter the name of product:");
                    System.out.println(S.calculateCostOf(S.inputName()));
                    break;
                case 4:
                    System.out.println("Please, enter the name of product:");
                    System.out.println(S.calculateAmountOf(S.inputName()));
                    break;
            }
            System.out.println("\n");
        }
    }
}
