package data.Access;

import entities.Product;

public class HiberNateProductDAO implements ProductDAO{
    @Override
    public void add(Product product) {
        System.out.println("Added to: HiberNate DataBase");

    }
}
