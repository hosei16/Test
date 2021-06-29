/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_problem3;

/**
 *
 * @author dewbabyo
 */
public class CylinderType extends CircleType {
    double height;
   public double getHeight() {
    return height;
   }
   public void setHeight(double height) {
    this.height = height;
   }
   public double volume(){
    return (3.14)*(this.radius * this.radius)*(this.height);
   }
   public double surfaceArea(){
      
    double one = 2*3.14*this.radius*this.height;
    double two = 2*3.14*this.radius*this.radius;
    return one+two;
   }
}
