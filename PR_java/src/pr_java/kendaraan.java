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
public interface  kendaraan {

    
 void drive();   
 void loaditems();
String getName();
void setName(String name);
double getMaxSpeed();
void setMaxSpeed(double speed);
public double getCurrSpeed();
void setCurrSpeed(double speed);
    public void getmaxweight(double maxweight);

    public void setCurrentWeight(double currentspeed);
}
