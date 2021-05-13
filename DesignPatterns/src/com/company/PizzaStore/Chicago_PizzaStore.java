package com.company.PizzaStore;

import com.company.PizzaEntity.Pizza;
import com.company.StylePizzaStore.*;

public class Chicago_PizzaStore extends PizzaStore {

    Pizza createPizza(String item){

        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
//        } else if (item.equals("veggie")) {
//            return new ChiStyleVeggiePizza();
//        } else if (item.equals("clam")) {
//            return new ChiStyleClamPizza();
//        } else if (item.equals("pepperoni")) {
//            return new ChiStylePepperoniPizza();
        } else return null;
    }
}
