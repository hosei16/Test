/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignemnt3;

/**
 *
 * @author dewbabyo
 */
public class ExtClock extends Clock{
private String timezone;
public ExtClock() {
this.timezone = "UTC";
}
public ExtClock(int hours, int minutes, int seconds, String timezone) {
super(hours, minutes, seconds);
this.timezone = timezone;
}
public void printTime() {
super.printTime();
System.out.print(" " + timezone);
}
public boolean equals(ExtClock otherClock) {
return super.equals(otherClock) && timezone.equalsIgnoreCase(otherClock.timezone);
}
public Clock getCopy() {
ExtClock temp = new ExtClock(getHours(), getMinutes(), getSeconds(), timezone);
return temp;
}
}
