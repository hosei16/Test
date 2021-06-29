import java.util.*;
import javax.swing.*;
import java.awt.*;
 
 
class Day
{
public static int day;
public static String days;
 
public Day()
{
setDay(1);
 
}
 
public Day (int day)
{
if( (day >0) &&(day <8))
{
this.day=day;
setDay(day);
}
else
{
day =(day%7);
if(day ==0)
day =7;
this.day =day;
setDay(day);
}
 
 
}
 
public String toString()
{
return (days);
}
 
 
public void setDay(int daycal)
{
if (daycal == 1)
days = "Sun";
if (daycal ==2)
days = "Mon";
if (daycal ==3)
days = "Tue";
if (daycal ==4)
days = "Wed";
if (daycal ==5)
days = "Thur";
if (daycal ==6)
days = "Fri";
if (daycal ==7)
days = "Sat";
}
public Day setNameDay(String day)
{
days = day;
 
return this;
}
 
public void printDay()
{
if (day <8)
System.out.print(days);
}
 
public void nextDay()
{
int daynext =day;
daynext++;
 
if (daynext <8)
setDay(daynext);
else
{
setDay(daynext-7);
}
 
}
 
public void previousDay()
{
int dayprev=day;
dayprev--;
 
if(dayprev <1)
{
dayprev = 7;
}
setDay(dayprev);
}
 
public void calculateDay()
{
int calc = 0;
String str;
int dayAdd =0;
 
str =JOptionPane.showInputDialog("Enter number of days to add");
calc =Integer.parseInt(str);
 
dayAdd = day +calc;
 
dayAdd = dayAdd %7;
if(dayAdd ==0)
dayAdd = 7;
 
setDay(dayAdd);
 
printDay();
}
}
 
 
 
public class TestProgDay
{
static Scanner console = new Scanner(System.in);
 
public static void main(String[] args)
{
Day myDay = new Day(2);
System.out.print("The day of the week is ");
myDay.printDay();
System.out.println();
 
System.out.print("The next day is ");
myDay.nextDay();
myDay.printDay();
System.out.println();
 
System.out.print("The previous day is ");
myDay.previousDay();
myDay.printDay();
System.out.println();
 
myDay.calculateDay();
System.out.println();
}
}
