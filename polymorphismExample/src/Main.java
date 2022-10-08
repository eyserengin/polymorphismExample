import business.ProductManager;
import core.DataBaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import data.Access.HiberNateProductDAO;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {


        Product product = new Product("Xiaomi","1",4000);

        ProductManager productManager = new ProductManager(new HiberNateProductDAO(), new Logger[] {new MailLogger(), new FileLogger()} );

        productManager.add(product);
    }
}
