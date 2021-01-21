package com.example.demo.dto;

public class ProductDto {
    private String name;
    private String BrandName;
    private String description;
    private Integer price;
    private Integer inStock;

    public ProductDto(){

    }

    public ProductDto(String name, String brandName, String description, Integer price, Integer inStock) {
        this.name = name;
        this.BrandName = brandName;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInStock() {
        return inStock;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }
}
