import java.io.*;
import java.text.*;
import java.util.*;
class Assignment1_Excercise2
{
 public static void main(String[] args)

    {
   
   
   try
   {

     PrintStream myconsole = new PrintStream (new File ("/Users/dewbabyo/Desktop/Assignment1"));
   double vP;
   
   DecimalFormat df = new DecimalFormat("##.##");
   Scanner cin = new Scanner (System.in);
   System.out.println("Enter your value of your propert");
   vP = cin.nextDouble();
   
   double taxAmt;
   double ntaxAmt;
   
   taxAmt = vP *.92;
   
  
     ntaxAmt = taxAmt *.0105;
   

   myconsole.println("Assessed Value: " + df.format(vP));
   System.out.println();
    myconsole.println("Taxable Amount: " + df.format(taxAmt));
    System.out.println();
     myconsole.print("Tax Rate for each $100.00: " + df.format(1.05));
      System.out.println();
    myconsole.println(" Property Tax: " + df.format(ntaxAmt));
    System.out.println();
   }
   catch (FileNotFoundException fx)
   {
System.out.println(fx);   
   }
   
    }

}

