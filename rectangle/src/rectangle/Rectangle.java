/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

public class Rectangle {
    public int width = 5;
    public int height = 4;
    
    public int CalculateArea() {
        int area;
        area = this.width * this.height;
        return area;
    }
    
    public int CalculatePerimeter() {
        int around;
        around = (this.width + this.height)*2;
        return around;
    }
}
