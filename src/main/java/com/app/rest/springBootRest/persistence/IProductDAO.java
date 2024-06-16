package com.app.rest.springBootRest.persistence;

import com.app.rest.springBootRest.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    List<Product> findByPriceInRange(BigDecimal miniPrice, BigDecimal maxPrice);

    void save(Product product);

    void deleteById(Long id);
}
