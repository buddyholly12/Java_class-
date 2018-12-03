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
public class Car implements Kendaraan_darat {

    static Object get(int arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private String name;
private double maxSpeed;
private int wheels;
private double currentSpeed;

public Car(String nm,double maxsp,int Wheels,double currspeed)
{
    this.name = nm;
    this.maxSpeed=maxsp;
    this.wheels=Wheels;
    this.currentSpeed=currspeed;
}
public Car(){
    
}

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public int getNumberofWheels() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumberofWheels(int wheels) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drive() {
    this.currentSpeed=currentSpeed+10;
    System.out.println(name);
    System.out.println(currentSpeed);
    System.out.println(maxSpeed);
    //System.out.println(wheels);
    }

    @Override
    public double getCurrSpeed() {
    return 0;   
    }

    @Override
    public void setCurrSpeed(double speed) {
        
    }

    @Override
    public void getmaxweight(double maxweight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCurrentWeight(double currentspeed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loaditems() {
    }

}
