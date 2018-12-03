/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr_java;

/**
 *
 * @author Andreas Pc
 */
public class Ship implements Kendaraan_laut
{
private String name;
private double maxWeight;
private double currentWeight;

public Ship(String nm,double maxwgh,double currweight)
{
    this.name=nm;
    this.maxWeight=maxwgh;
    this.currentWeight=currweight;
}
public Ship()
{}

    @Override
    public double getMaxWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxWeight(double weight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadItems() {
    this.currentWeight=currentWeight+10;  
    System.out.println(name);
    System.out.println(currentWeight);
    System.out.println(maxWeight);
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
     }

    @Override
    public double getMaxSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxSpeed(double speed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCurrSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCurrSpeed(double speed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getmaxweight(double maxweight) {
     }

    @Override
    public void setCurrentWeight(double currentspeed) {
      }

    @Override
    public void drive() {
        
    }

    @Override
    public void loaditems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
