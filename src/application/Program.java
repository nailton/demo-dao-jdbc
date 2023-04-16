package src.application;

import src.entities.model.Seller;
import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
