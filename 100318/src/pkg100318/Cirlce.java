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
public class Cirlce implements shapesInterface{
    private double jari;
    public Cirlce(double jari)
    {
        this.jari=jari;
    }
    @Override
    public double CalculateArea() {
        return 3.14* jari *jari;
    }

    @Override
    public double Calculatekeliling() {
        return 3.14*2*jari;
    }

    @Override
    public void print() {
    System.out.println("Luas: "+CalculateArea());
    System.out.println("Keliling: "+Calculatekeliling());
    
    }
    
}
