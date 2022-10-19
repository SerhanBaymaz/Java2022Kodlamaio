package week3.oopWithNLayerdApp.business;

import week3.oopWithNLayerdApp.core.logging.ILogger;
import week3.oopWithNLayerdApp.dataAccess.HibernateProductDao;
import week3.oopWithNLayerdApp.dataAccess.IProductDao;
import week3.oopWithNLayerdApp.dataAccess.JdbcProductDao;
import week3.oopWithNLayerdApp.entities.Product;

import java.util.List;

public class ProductManager {
    //Business rules - iş kuralları - domainler yazılır.
    private IProductDao productDao;
    private List<ILogger> loggers;

    public ProductManager(IProductDao productDao,List<ILogger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add (Product product) throws Exception{
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        productDao.add(product);

        for (ILogger loggerX : loggers) {
            loggerX.log(product.getName());
        }
    }


}
