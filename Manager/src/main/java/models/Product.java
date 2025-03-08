package models;

import exceptions.MyException;

import java.util.Date;

public class Product {
    private final long id;
    private final String name;
    private final Date expirationDate;

    public Product(long id, String name, Date expirationDate) throws MyException {
        NamesProduct.addProduct(this);
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Product(long id, Date expirationDate) throws MyException {
        this.id = id;
        this.name = NamesProduct.getName(id);
        this.expirationDate = expirationDate;
    }

    public Product(String name, Date expirationDate) throws MyException {
        this.id = NamesProduct.getId(name);
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
}
