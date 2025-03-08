package models;

import exceptions.MyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {

    private String name;
    private HashMap<Long, List<Product>> inventory;

    public Inventory(String name){
        this.name = name;
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) throws MyException{
        if (inventory.containsKey(product.getId())){
            inventory.get(product.getId()).add(product);
        } else createProduct(product);
    }

    private void createProduct(Product product) throws MyException {
        NamesProduct.addProduct(product);
        List<Product> products = new ArrayList<>();
        products.add(product);
        inventory.put(product.getId(), products);
    }
}
