package com.example.ktncbaitest.buoi9;

public class XeOto {

    private Integer carID;

    private String name;

    private String brand;

    private String model;

    private Double price;

    private Integer quantity;

    private Integer year;

    private String color;

    public XeOto() {
    }

    public XeOto(Integer carID, String name, String brand, String model, Double price, Integer quantity, Integer year, String color) {
        this.carID = carID;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.year = year;
        this.color = color;
    }

    public Integer getCarID() {
        return carID;
    }

    public void setCarID(Integer carID) {
        this.carID = carID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "XeOto{" +
                "carID=" + carID +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

}
