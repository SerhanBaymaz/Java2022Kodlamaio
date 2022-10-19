package week3.oopWithNLayerdApp.dataAccess;

import week3.oopWithNLayerdApp.entities.Product;

public class HibernateProductDao implements IProductDao{//sadece db erişim kodlarının yazıldığı classtır. SQL
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklendi.");

    }


}
