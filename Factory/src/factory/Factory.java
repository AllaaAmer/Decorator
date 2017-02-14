/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Nour
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();
        //********************AlaaStart**********************
        String type = "Cheese";
        PizzaRestaurant rest = new PizzaRestaurant(factory);
        rest.OrderPizza(type);
        
        System.out.println("************************************************");

        String type1 = "Vegetables";
        PizzaRestaurant rest1 = new PizzaRestaurant(factory);
        rest.OrderPizza(type1);
        
        System.out.println("************************************************");

        //********************AlaaEnd**********************
        //********************NourStart**********************
        String type2 = "SeaFood";
        PizzaRestaurant rest2 = new PizzaRestaurant(factory);
        rest.OrderPizza(type2);
        //********************NourEnd**********************
    }

}
