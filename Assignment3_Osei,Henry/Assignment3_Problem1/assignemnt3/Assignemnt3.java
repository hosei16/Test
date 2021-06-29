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
public class Assignemnt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Clock c = new Clock(15, 10, 45);
c.printTime();
System.out.println("\n");
ExtClock extC = new ExtClock(10, 15, 00, "IST");
extC.printTime();
    // TODO code application logic here
    }
    
}
