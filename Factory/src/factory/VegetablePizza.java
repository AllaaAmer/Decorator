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
public class VegetablePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing Vegetable Pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking Vegetable Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting Vegetable Pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing Vegetable Pizza");
    }
    
}
