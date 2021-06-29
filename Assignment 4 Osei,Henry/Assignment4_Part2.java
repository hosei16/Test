import java.util.*;
public class Assignment4_Part2
{public static void main(String[] args)
{Scanner in=new Scanner(System.in);
int i;
do
{System.out.print("How many rows? ");
i=in.nextInt();
if(i<0)
 System.out.println("must be nonnegative");
}while(i<0);
line(i,1,i);
 
}
public static void line(int m,int n,int p)
{int i;
if(m>p)
  return;
for(i=0;i<m;i++)
 System.out.print("*");
if(m>0)
 System.out.println();
if(m==0||n==0)
   line(m+1,0,p);
else
 line(m-1,n,p);
}
}
 
