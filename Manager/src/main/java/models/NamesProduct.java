package models;

import exceptions.MyException;

import java.util.HashMap;

public class NamesProduct {

    private static HashMap<Long, String> namePerId = new HashMap<>();

    public static String getName(long id) throws MyException {
        if (namePerId.containsKey(id)){
            return namePerId.get(id);
        }
        throw new MyException("ID does not exist.");
    }

    public static Long getId(String name) throws MyException {
        for (Long id : namePerId.keySet()){
            if (namePerId.get(id).equals(name)){
                return id;
            }
        }
        throw new MyException("Name does not exist.");
    }

    public static void addProduct(Product product) throws MyException {
        if (!namePerId.containsKey(product.getId()) && !namePerId.containsValue(product.getName())){
            namePerId.put(product.getId(), product.getName());
        } else throw new MyException("Id or Name is already exist");
    }
}
