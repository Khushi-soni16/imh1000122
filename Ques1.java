/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ques1;

/**
 *
 * @author CH JPL
 */
public class Ques1 {

    class Square 
{
    void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
    void Area(float side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
}
    class Circle 
{
   
  
  
    void Area(double r)
    {
        double A = 3.14 * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }
  
 
    void Area(float r)
    {
        double A = 3.14 * r * r;
  
        System.out.println("The area of the circle is :" + A);
    }

class Rectangle 
{
 
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
    void Area(int l, int b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
    
}
    }public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.Area(30, 20);
        obj.Area(12.5, 4.5);
        
        Circle obj1 = new Circle();
        obj1.Area(3);
        obj1.Area(5.5);
        
        Square obj2 = new square();
        obj2.Area(20);
        obj2.Area(5.2);
        
    }
}
    
        
    
    

