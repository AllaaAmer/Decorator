/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author alaa
 */
public class BeefSandwich extends Sandwich {

    @Override
    public String getDescription() {
        return super.getDescription()+ " with Beef "; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public float getPrice() {
        return super.getPrice()+ 5f; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
