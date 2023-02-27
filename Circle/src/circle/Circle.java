/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

public class Circle {
    public int radius = 10;
    
    public double CalculateArea() {
        double area;
        area = 3.14 * this.radius * this.radius;
        return area;
    }
    
    public double CalculatePerimeter() {
        double around;
        around = 3.14 * (2 * this.radius);
        return around;
    } 
}
