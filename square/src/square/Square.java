/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package square;

public class Square {
    public int LengthOfSide = 5;
    
    public int CalculateArea() {
        int area;
        area=this.LengthOfSide * this.LengthOfSide;
        return area;
    }
    
    public int calculatePerimeter() {
        int perimeter;
        perimeter = this.LengthOfSide * 4;
        return perimeter;
    }
}