package com.company;

import com.company.PizzaEntity.Pizza;
import com.company.PizzaStore.Chicago_PizzaStore;
import com.company.PizzaStore.NY_PizzaStore;
import com.company.PizzaStore.PizzaStore;
import com.company.StylePizzaStore.NYStyleCheesePizza;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NY_PizzaStore();
        PizzaStore chicagoStore = new Chicago_PizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+ "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+ "\n");
    }
}
