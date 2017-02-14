/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Nour
 */
public class Cheese extends CondimateDecorator{

    private Sandwich sandwich;
    
    public Cheese(Sandwich sandwich) {
        this.sandwich=sandwich;
    }
    
    @Override
    public String getDescription() {
        return sandwich.getDescription()+" with cheese";
    }

    @Override
    public float getPrice() {
        return sandwich.getPrice()+2; 
    }
    
    
    
}
