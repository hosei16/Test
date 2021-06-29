/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemtn3_problem2;

/**
 *
 * @author dewbabyo
 */
import java.util.*;

public class Assignemtn3_Problem2 {
static Scanner in = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle a= new Circle(1,2,3);
Circle b = new Circle();
double x,y,r;
System.out.print("a: ");
a.print();
System.out.print("b: ");
b.print();
b.setCircle(5,6,7);
System.out.print("b after set: ");
b.print();
if (a.equals(b))
System.out.println("a=b");
else
System.out.println("a!=b");
System.out.print("Enter new center point for a\nenter x ");
x= in.nextDouble();
System.out.print("Enter y : ");
y =in.nextDouble();
System.out.print("Enter the radius: ");
r=in.nextDouble();
a.setCircle(x,y,r);
System.out.print("New a: ");
a.print();
b.copy(a);
System.out.print("After copying\na:");
a.print();
System.out.print("b: ");
b.print();
if (a.equals(b))
System.out.println("a=b");
else
System.out.println("a!=b");
System.out.println("Area of b: "+b.area());
System.out.println("Circumference of b: "+b.circumference());
 
}

    }
    

