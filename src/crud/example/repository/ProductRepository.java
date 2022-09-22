package com.crud.example.repository;

import com.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {//first arg is model class name and 2nd for primary key datatype
    Product findByName(String name);

}
