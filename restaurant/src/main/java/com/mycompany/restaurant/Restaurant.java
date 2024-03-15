
package com.mycompany.restaurant;

import food.Dish;
import person.Customer;
import values.CustomerRole;

public class Restaurant {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT,"1234B","Mao");
        student.sellFood();
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"9231D","Josefina");
        administrative.sellFood();
        Dish breakfast1 = new Dish("Desayuno",15, (float) 7.000,"Huevitos pericos con cafe","Huevo,tomate y cebolla");
        Dish breakfast2 = new Dish("Desayuno",10, (float) 7.000,"Arepa con Chorizo con cafe","Arepa y chorizo de res");
        Dish lunch1 = new Dish("Almuerzo",25, (float) 7.000,"Bandejita pue mijo","arroz, carne molida, chicharron, huevo y aguacate");
        Dish lunch2 = new Dish("Almuerzo",20, (float) 7.000,"La tipica","Arroz, pollo guisado con papa y ensalada");
    }
}
