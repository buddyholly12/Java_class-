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
public class cylinder extends Circle {
    protected double height=1.0;
    public cylinder()
    {
        
    }
    public cylinder(double radius)
    {
        this.radius=radius;
    }
    public cylinder(double radius,double height)
    {
     this.radius=radius;
        this.height=height;
    }
    public cylinder(double radius,double height,String color)
    {
     this.radius=radius;
        this.height=height;
        this .color=color;
    }
     
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume()
    {
        return 3.14*radius*radius*height;
    }

   public void print()
   {
       System.out.println("Volume: "+getVolume());
       System.out.println(color);
       
   }

    @Override
    public String toString() {
        return "cylinder{" + "height= " + height + ",Radius" +radius + ",color "+color +'}';
    }
    
  
}
