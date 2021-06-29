import java.util.*;
public class Assignment5_Problem2
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("How many lines to be sorted:");
int size=input.nextInt();
String[] lines=new String[size];
lines[0]=input.nextLine();
System.out.println("please enter lines...");
for(int i=0;i<lines.length;i++)
{
lines[i]=input.nextLine();
}
System.out.println();
System.out.println("Lines Before Sorting:");
System.out.println(Arrays.toString(lines));
mergeSort(lines);
System.out.println();
System.out.println("Lines after Sorting:");
System.out.println(Arrays.toString(lines));
}
public static void mergeSort(String[] s)
{
if(s.length>1)
{
String[] left=Arrays.copyOfRange(s,0,s.length/2);
String[] right=Arrays.copyOfRange(s,s.length/2,s.length);
mergeSort(left);
mergeSort(right);
merge(s,left,right);
}
}
public static void merge(String[] result, String[] left, String[] right)
{
int i1 = 0;
int i2 = 0;
for (int i = 0; i < result.length; i++)
   {
   if (i2 >= right.length || (i1 < left.length &&left[i1].compareToIgnoreCase(right[i2])<0))
   {
result[i] = left[i1];
i1++;
}
   else
   {
result[i] = right[i2];
i2++;
}
}
}
}
