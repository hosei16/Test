import java.util.Scanner;
public class Assignment4_Bonus
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); // Scanner declaration
System.out.print("Enter number of rows:");
int lines=sc.nextInt();
pattern(lines); // accept number of lines
}
public static void pattern(int rows)
{
int space;
for(int i = 1, k = 0; i <= rows-1; ++i, k = 0)
{
for(space = 1; space <= rows-i+1; ++space) // Loop to create space
{
System.out.print(" "); // it create space
}
while(k < i)
{
System.out.print("* "); // It print *
++k;
}
System.out.println(); // It print new lines
}
for(int i = rows; i >= 1; --i)
{
for(space = 0; space < rows-i; ++space)
System.out.print(" "); // print space
  
for(int j = i; j <= i; ++j)
System.out.print(" *"); // print *
for(int j = 0; j < i-1; ++j)
System.out.print(" *"); // print *
System.out.println();
}
System.out.println();
}
}
 
