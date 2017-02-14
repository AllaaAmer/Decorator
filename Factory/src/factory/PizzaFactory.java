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
            pizza = new CheesePizza();
        else if(type.equals("Vegetables"))
            pizza = new VegetablePizza();
        else if (type.equals("SeaFood"))
            pizza = new SeaFoodPizza();
        
        return pizza;
    }
}
