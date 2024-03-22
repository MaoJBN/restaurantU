
package com.mycompany.restaurant.food;

import com.mycompany.restaurant.values.DishType;

public class Dish {
    private DishType type;
    private int quanty;
    private float price;
    private String nameDish;
    private String ingredients;

    public Dish(DishType type, int quanty, float price, String nameDish, String ingredients) {
        this.type = type;
        this.quanty = quanty;
        this.price = price;
        this.nameDish = nameDish;
        this.ingredients = ingredients;
    }

    public DishType getType() {
        return type;
    }

    public String getNameDish() {
        return nameDish;
    }

    public String getIngredients() {
        return ingredients;
    }
    
}
