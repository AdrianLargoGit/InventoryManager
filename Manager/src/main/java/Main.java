import models.Inventory;
import models.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Product product = new Product(1L, "Producto1", new Date());
            Inventory inventory = new Inventory("TestInventory");
            inventory.addProduct(product);
            System.out.println("Product added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
