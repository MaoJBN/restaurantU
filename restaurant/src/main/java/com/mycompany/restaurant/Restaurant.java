
package com.mycompany.restaurant;

import com.mycompany.restaurant.food.Dish;
import com.mycompany.restaurant.food.Menu;
import com.mycompany.restaurant.person.Customer;
import com.mycompany.restaurant.values.CustomerRole;
import com.mycompany.restaurant.values.DishType;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer student = new Customer(CustomerRole.STUDENT,"1234B","Mao");
        student.sellFood();
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"9231D","Josefina");
        administrative.sellFood();
        Dish breakfast1 = new Dish(DishType.BREAKFAST,15, (float) 7.000,"Huevitos pericos con cafe","Huevo,tomate y cebolla");
        Dish breakfast2 = new Dish(DishType.BREAKFAST,10, (float) 7.000,"Arepa con Chorizo con cafe","Arepa y chorizo de res");
        Dish lunch1 = new Dish(DishType.LUNCH,25, (float) 7.000,"Bandejita pue mijo","arroz, carne molida, chicharron, huevo y aguacate");
        Dish lunch2 = new Dish(DishType.LUNCH,20, (float) 7.000,"La tipica","Arroz, pollo guisado con papa y ensalada");
        
        Menu menu = new Menu();
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        menu.addDish(lunch2);
        
        System.out.println("Oprima el numero para ver el menu \n 1.Desayuno \n 2. Almuerzo");
        
        int b;
        b = sc.nextInt();
        switch(b) {
            case 1 -> System.out.println("Desayuno = " + menu.getDishesPerType(DishType.BREAKFAST));
            case 2 -> System.out.println("Almuerzo = " + menu.getDishesPerType(DishType.LUNCH));
            default -> System.out.println("No existe el menu");
        }
        
        System.out.println(student.buyFood());
    }
}
