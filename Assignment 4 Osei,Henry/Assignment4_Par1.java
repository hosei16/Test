import java.util.*;
public class Assignment4_Par1
{public static void main(String[] args)
{line(4,1,4);
 
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
