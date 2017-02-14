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
public class SeaFoodPizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("preparing SeaFood Pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking SeaFood Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting SeaFood Pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing SeaFood Pizza");
    }
    
}
