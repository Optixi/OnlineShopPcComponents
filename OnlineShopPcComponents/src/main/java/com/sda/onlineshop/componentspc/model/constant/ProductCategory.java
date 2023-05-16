package com.sda.onlineshop.componentspc.model.constant;

public enum ProductCategory {

    GRAPHIC_CARDS("Graphic Cards"),
    MOTHERBOARDS("MOTHERBOARDS"),
    PROCESSORS("PROCESSORS"),
    MEMORY("MEMORY");
    private final String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
