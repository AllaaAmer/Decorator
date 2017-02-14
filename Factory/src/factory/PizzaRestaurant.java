/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author alaa
 */
public class PizzaRestaurant {
    PizzaFactory factory;

    public PizzaRestaurant(PizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza OrderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
    
    
}
