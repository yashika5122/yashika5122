package com.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_Info") // if you do not give table name then class name will be you table name
public class Product {

    @Id
    @GeneratedValue //to increase value automatic
    private int id;
    private String name;
    private int quantity;
    private double price;
}
