package com.sda.onlineshop.componentspc.model;

import com.sda.onlineshop.componentspc.model.constant.ProductCategory;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "model")
    private String model;
    @Column(name = "specifcation")
    private String specification;
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private ProductCategory category;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private Double price;

    public Product() {
    }

    public Product(String name, String model, String specification, ProductCategory category, String manufracturer, double price) {
        this.name = name;
        this.model = model;
        this.specification = specification;
        this.category = category;
        this.manufacturer = manufracturer;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", specification='" + specification + '\'' +
                ", category=" + category +
                ", manufracturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }
}
