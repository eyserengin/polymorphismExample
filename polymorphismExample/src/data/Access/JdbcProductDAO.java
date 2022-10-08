package data.Access;

import entities.Product;

public class JdbcProductDAO implements ProductDAO{
    @Override
    public void add(Product product) {
        System.out.println("Added to: JDBC DataBase");
    }
}
