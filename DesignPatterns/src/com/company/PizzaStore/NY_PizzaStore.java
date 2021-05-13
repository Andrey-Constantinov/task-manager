package com.company.PizzaStore;

import com.company.PizzaEntity.Pizza;
import com.company.StylePizzaStore.*;

public class NY_PizzaStore extends PizzaStore {

    Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new NYStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new NYStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new NYStylePepperoniPizza();
        } else return null;
        }
    }

