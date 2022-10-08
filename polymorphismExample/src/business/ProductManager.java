package business;

import core.Logger;
import data.Access.ProductDAO;
import entities.Product;


public class ProductManager {
    ProductDAO productDAO;
    Logger[] loggers;


    public ProductManager(ProductDAO productDAO, Logger[] loggers) {
        this.productDAO = productDAO;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if(product.getPrice() < 10){
            throw new Exception("Product price is not lest than 10");
        }
        else
            productDAO.add(product);

        for (Logger loggers : loggers){
            loggers.log(product.getName());
        }

    }
}
