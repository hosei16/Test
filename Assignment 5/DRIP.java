import java.util.*;
class DRIP
{
  static void TH (int n, char from_rod, char to_rod, char aux_rod)
  {
  if (n==1)
  {
  
  System.out.println ("move disk 1 from" + from_rod+ "to rod" + to_rod);
  
  }
  
  TH(n-1,from_rod,to_rod,aux_rod);
  
  System.out.println ("move disk "+ n +"from rod"+ from_rod+ "to rod" + to_rod);
  
  TH(n-1,aux_rod,to_rod,from_rod);
  }
   public static void main(String args[]) 
    { 
        int n = 4;  
        TH(n, 'A', 'C', 'B');  
    } 
}