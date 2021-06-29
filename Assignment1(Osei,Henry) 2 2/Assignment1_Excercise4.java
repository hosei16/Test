import java.text.*;
import java.util.*;
public class Assignment1_Excercise4
{
public static void main(String[] args) {
      double cost;
        int minutes;
        Scanner cin = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("##.##");
       
       System.out.println("Please enter the amount of minutes you were on the call");
       minutes = cin.nextInt();
       
       if (minutes <=3)
       {
       
       
       cost = 1.99 + 2.00;
       
       
       System.out.println("The cost of your call was" + df.format(cost));
     }
       else if (minutes >3)
       {
           minutes = minutes - 3;
       cost = (1.99 + 2.00)+(minutes *.45);
       System.out.println("The cost of your call was"+df.format(cost));
       }
    }
    
}
