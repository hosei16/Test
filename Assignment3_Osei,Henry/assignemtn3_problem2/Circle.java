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
public class Circle extends Point {
    double radius;
public Circle()
{setCircle(0.0, 0.0, 0.0 );
}
public Circle(double x, double y, double r )
{setCircle( x ,y, r );
}
public void setCircle( double x, double y, double r )
{setPoint(x, y);
setRadius(r);
}
public double getRadius()
{return radius;
}
public void setRadius(double r)
{radius = r;
}
public boolean equals(Circle otherCircle)
{return (super.equals(otherCircle) &&radius == otherCircle.radius);
}
public void copy(Circle c)
{super.copy(c);
radius =c.radius;
}
public void print()
{System.out.printf("=[%.2f,%.2f,%.2f]\n",x,y,radius);
}
public double area()
{return Math.PI * radius * radius;
}
public double circumference()
{return 2 * Math.PI * radius;
}
}


