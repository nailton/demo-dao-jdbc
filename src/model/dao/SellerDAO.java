package src.model.dao;

import src.entities.model.Seller;

import java.util.List;

public interface SellerDAO {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Seller id);

    Seller findById(Integer id);

    List<Seller> findAll();
}
