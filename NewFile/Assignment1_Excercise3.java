import java.util.*;
public class Assignment1_Excercise3
{
public static void main(String[] args) 
    {
        int grade;
        
        grade = getGrade ();
        
        if (grade <60)
        {
        System.out.println("Failing");
        }
        else if (grade >=60 && grade <=62)
        {
         System.out.println(0.7);
        }
        else if (grade == 63)
        {
        System.out.println(0.8);
        }
        else if (grade == 64)
        {
        System.out.println(0.9);
        }
        else if (grade == 65)
        {
        System.out.println(1.0);
        }
        else if (grade == 92)
        {
        System.out.println(3.7);
        }
        else if (grade == 93)
        {
        System.out.println(3.8);
        }
        else if (grade == 94)
        {
        System.out.println(3.9);
        }
        else if (grade>=95)
        {
        System.out.println(4.0);
        System.out.println("Perfect");
          
        }
    }
    
    public static int getGrade ()
    {
        int gval;
        Scanner cin = new Scanner(System.in); 
        System.out.println("Please enter your course grade in a numerical value");
        gval = cin.nextInt();
        
        return gval;
    }
}
