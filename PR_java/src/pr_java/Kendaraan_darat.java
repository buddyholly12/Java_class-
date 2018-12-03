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
public interface Kendaraan_darat extends kendaraan
{
 int getNumberofWheels();
void setNumberofWheels(int wheels);
void drive();   
}
