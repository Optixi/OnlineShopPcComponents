package com.sda.onlineshop.componentspc.model;

import com.sda.onlineshop.componentspc.model.constant.ProductCategory;
import jakarta.persistence.*;

import java.util.Objects;

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
    @Column(name ="promo_price")
    private Double promoPrice;
    @Column(name = "main_image_url")
    private String mainImageUrl;

    public Product() {
    }

    public Product(String name, String model, String specification, ProductCategory category, String manufacturer, Double price, Double promoPrice, String mainImageUrl) {
        this.name = name;
        this.model = model;
        this.specification = specification;
        this.category = category;
        this.manufacturer = manufacturer;
        this.price = price;
        this.promoPrice = promoPrice;
        this.mainImageUrl = mainImageUrl;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
