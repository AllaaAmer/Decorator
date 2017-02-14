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
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /************************ AllaaStarted ****************/
        Sandwich chickenSandwich = new ChickenSandwich();
        System.out.println("**********************************************");
        System.out.println("You ordered : " + chickenSandwich.getDescription());
        System.out.println("with Price : "+ chickenSandwich.getPrice());
        System.out.println("*********************************************");
        
        Sandwich fishSandwich = new FishSandwish();
        System.out.println("**********************************************");
        System.out.println("You ordered : " + fishSandwich.getDescription());
        System.out.println("with Price : "+ fishSandwich.getPrice());
        System.out.println("*********************************************");
        /************************ AllaaEnd ****************/ 
        
        
        /************************ NourStarted ****************/
        
        
        /************************ NourEnd ****************/
    }
    
    
}
