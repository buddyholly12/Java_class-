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
public abstract class Car {
    protected String merk;
    public abstract void print();
   
    public void defaultmerk()
    { 
        merk ="merk1";
    }
}
