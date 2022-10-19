package week3.oopWithNLayerdApp;

import week3.oopWithNLayerdApp.business.ProductManager;
import week3.oopWithNLayerdApp.core.logging.DatabaseLogger;
import week3.oopWithNLayerdApp.core.logging.FileLogger;
import week3.oopWithNLayerdApp.core.logging.ILogger;
import week3.oopWithNLayerdApp.core.logging.MailLogger;
import week3.oopWithNLayerdApp.dataAccess.HibernateProductDao;
import week3.oopWithNLayerdApp.dataAccess.JdbcProductDao;
import week3.oopWithNLayerdApp.entities.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("*************************************");
        System.out.println();

        Product product1 = new Product(1,"IPhone XR",10000);


        ArrayList<ILogger> loggers = new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DatabaseLogger());
        loggers.add(new MailLogger());

        ProductManager productManagerHipernate = new ProductManager(new HibernateProductDao(),loggers);
        productManagerHipernate.add(product1);
        System.out.println();
        ProductManager productManagerJdbc = new ProductManager(new JdbcProductDao(),loggers);
        productManagerJdbc.add(product1);







        System.out.println();
        System.out.println("*************************************");

    }
}
//19.10.2022 23:40 Antalya