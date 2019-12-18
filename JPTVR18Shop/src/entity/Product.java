/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author pupil
 */

public class Product {
    private String name;
    private int price;
    private int countofproduct;

    public Product() {
    }

    public Product(String name, int price, int countofproduct) {
        this.name = name;
        this.price = price;
        this.countofproduct = countofproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCountofproduct() {
        return countofproduct;
    }

    public void setCountofproduct(int countofproduct) {
        this.countofproduct = countofproduct;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.price;
        hash = 97 * hash + this.countofproduct;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.price != other.price) {
            return false;
        }
        if (this.countofproduct != other.countofproduct) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", countofproduct=" + countofproduct + '}';
    }
        
    
}

