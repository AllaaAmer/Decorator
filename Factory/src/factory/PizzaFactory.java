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
public class PizzaFactory {
    
    Pizza pizza = null;
    
    public Pizza createPizza (String type){
        if (type.equals("Cheese"))
            pizza = null ; //new CheesePizza();
        else if(type.equals("Vegetables"))
            pizza = null; // VegetablesPizza();
        else if (type.equals("SeaFood"))
            pizza = null; //SeaFoodPizza();
        return pizza;
    }
}
