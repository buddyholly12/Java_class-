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
public class Rect implements shapesInterface {
    private double panjang;
    private double lebar;
    public Rect (double panjang,double lebar)
    {
       this.panjang=panjang;
       this.lebar=lebar;
    }
    @Override
    public double CalculateArea() {
        return panjang*lebar;
    }

    @Override
    public double Calculatekeliling() {
         return 2*panjang*lebar;   
    }

    @Override
    public void print() {
    System.out.println("Luas: "+CalculateArea());
    System.out.println("Keliling: "+Calculatekeliling());
    }
    
}
