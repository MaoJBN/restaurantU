
package com.mycompany.restaurant.food;

public class Dish {
    private String type;
    private int quanty;
    private float price;
    private String nameDish;
    private String ingredients;

    public Dish(String type, int quanty, float price, String nameDish, String ingredients) {
        this.type = type;
        this.quanty = quanty;
        this.price = price;
        this.nameDish = nameDish;
        this.ingredients = ingredients;
    }
    
}
