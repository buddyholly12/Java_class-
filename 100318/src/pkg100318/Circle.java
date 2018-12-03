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
public class Circle {
    protected double radius;
    protected String color;
    public Circle()
    {
        
    }
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color)
    {
     this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius= " + radius + ", color= " + color + ",Area: " + getArea()+ '}';
    }
    
   
    
}
