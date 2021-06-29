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
public class Point 
{

   	protected double x, y; // coordinates of the Point

   		//Default constructor
   	public Point()
   	{
      	setPoint( 0, 0 );
   	}

   		//Constructor with parameters
   	public Point(double xValue, double yValue )
   	{
      	setPoint(xValue, yValue );
   	}

   		// set x and y coordinates of Point
   	public void setPoint(double xValue, double yValue )
   	{
      	x = xValue;
      	y = yValue;
   	}

   		// get x coordinate
   	public double getX()
   	{
      	return x;
   	}

   		// get y coordinate
   	public double getY()
   	{
      	return y;
   	}

   		// convert point into String representation
   	public String toString()
   	{
      	return "[" + String.format("%.2f", x)
      	       + ", " + String.format("%.2f", y) + "]";
   	}

     //Method to compare two points
   	public boolean equals(Point otherPoint)
   	{
       	return(x == otherPoint.x &&
               y == otherPoint.y);
   	}

     //Method to compare two points
  	public void makeCopy(Point otherPoint)
  	{
      	x = otherPoint.x;
      	y = otherPoint.y;
	}

   	public Point getCopy()
   	{
      	Point temp = new Point();

      	temp.x = x;
      	temp.y = y;

      	return temp;
   	}

   		// print method
   	public void printPoint()
   	{
      	System.out.print("[" + String.format("%.2f", x)
      	               + ", " + String.format("%.2f", y) + "]");
   	}

    void copy(Circle c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  // end class Point

    

