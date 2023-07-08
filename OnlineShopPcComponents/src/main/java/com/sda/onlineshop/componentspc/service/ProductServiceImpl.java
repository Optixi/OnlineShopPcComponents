package com.sda.onlineshop.componentspc.service;

import com.sda.onlineshop.componentspc.model.Product;
import com.sda.onlineshop.componentspc.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);

    }
    @Override
    public void update(int id, Product product) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with ID: " +id));

        existingProduct.setName(product.getName());
        existingProduct.setModel(product.getModel());
        existingProduct.setSpecification(product.getSpecification());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setManufacturer(product.getManufacturer());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setMainImageUrl(product.getMainImageUrl());
        existingProduct.setPromoPrice(product.getPromoPrice());
        productRepository.save(existingProduct);
    }

    @Override
    public void delete(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }
}
