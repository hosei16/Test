/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdrivers;

/**
 *
 * @author dewbabyo
 */
public class StackDrivers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int elements[]={10,20,30,40,50};
    	int elements2[]={20,30,40,50,60};
       
    	StackClass stack1=new StackClass(elements);
    	StackClass stack2=new StackClass(elements2);
       
    	System.out.println("Stack1 contains:");       
    	stack1.display();
    	System.out.println("\nStack2 contains:");
    	stack2.display();
       
    	if(stack1.equalStack(stack2))
        	System.out.println("\nBoth are equal");
    	else
        	System.out.println("\nBoth are not equal");

    }
    
}
