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
import java.util.*;
public class Assignment_Problem3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    CylinderType cylinder = new CylinderType();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius: ");
    double r = Double.valueOf(sc.nextLine());
    System.out.println("Enter Height: ");
    double h = Double.valueOf(sc.nextLine());
    cylinder.setRadius(r);
    cylinder.setHeight(h);
    System.out.println(cylinder.volume());
    System.out.println(cylinder.surfaceArea());
   }
    }
    

