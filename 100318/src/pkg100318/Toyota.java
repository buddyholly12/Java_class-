/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100318;

/**
 *
 * @author Andreas Pc
 */
public class Toyota extends Car {
    public Toyota()
    {
        merk="toyota";
        }
    
    @Override
    public void print() {
        System.out.println("merk: "+merk);
             
    }
    
}
