/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elips;

public class Elips {
    public int SemiMinorAxis = 4;
    public int SemiMajorAxis = 5;
    
    public double CalculateArea() {
        double area;
        area= 0.5*3.14*((2*this.SemiMinorAxis)*(2*this.SemiMajorAxis));
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter;
        perimeter = 0.5 * 3.14 * ((2*this.SemiMinorAxis)+(2*this.SemiMajorAxis));
        return perimeter;
    }
}
