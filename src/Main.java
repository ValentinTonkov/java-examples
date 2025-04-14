import warehouse.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static LinkedList<Product> products = new LinkedList<>();

    private static int getProductIndexByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Product p1 = new Product(1,"Bread", 1.6, 10);
        products.add(p1);
        products.add(new Product(2, "Cheese", 6, 5));
        products.add(new Product(3, "Chocolate", 2.7, 7));
        products.add(new Product(4, "Cola", 2, 13));

        //Product mostExpensiveProduct = products.getFirst();
        Product mostExpensiveProduct = products.get(0);

        for (int i = 1; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getPrice() > mostExpensiveProduct.getPrice()) {
                mostExpensiveProduct = products.get(i);
            }
        }


        for (Product product : products) {
            System.out.println(product);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        int index = getProductIndexByName(name);
        if (index == -1) {
            System.out.println("Product not found");
        } else {
            System.out.print("Add quantity: ");
            int quantity = scanner.nextInt();
            int availableQuantity = products.get(index).getQuantity();
            products.get(index).setQuantity(availableQuantity + quantity);
        }


        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }

        /*

        products.forEach(System.out::println);

        products.forEach((product) -> {
            System.out.println(product);
        });
        */

        // Choose product:      Bread    (proverka dali sushtestvuva)
        // The quantity is: X, insert quantity:     (proverka dali e nalichno)

    }
}