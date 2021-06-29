import java.util.*;
public class Assignment_Problem1 {
 public static void main(String[] args) {
     int[] list=new int[2500];
     Random rand=new Random();
     int numOfComparisions=0;
       
     for(int i=0;i<2500;i++)
         list[i]=rand.nextInt(2500)+1;
       
     sort(list);
       
     System.out.println("Search using Binary Search: ");
     numOfComparisions=BinarySearch(list,50);       
     System.out.println("Number of comparisions are: "+numOfComparisions);
       
     System.out.println("Search using Binary Search switching to Sequential search when the list size is less than 15: ");
     numOfComparisions=SwitchBinaryToSequential(list,50);       
     System.out.println("Number of comparisions are: "+numOfComparisions);
 }
   
 public static void sort(int list[]){
     for(int i=0;i<list.length-1;i++)
         for(int j=i+1;j<list.length;j++)
             if(list[i]>list[j]){
                 int tmp=list[i];
                 list[i]=list[j];
                 list[j]=tmp;          
             }                  
 }
   
 public static int BinarySearch(int []list,int element){
     int first = 0;
     int last = list.length-1;
     int mid;
     int numOfComparisions=0;
       
     while (first <= last) {
         mid = (first + last) / 2;
         numOfComparisions++;
         if (list[mid] == element) {
             System.out.println("Element "+element+" is found at location: "+(mid+1));
             return numOfComparisions;
         } else if (list[mid] < element) {
             first = mid + 1;
         } else {
             last = mid - 1;
         }
     }
     System.out.println("Element "+element+" is not found in the list");
     return numOfComparisions;
 }
   
 public static int SwitchBinaryToSequential(int []list,int element){
     int first = 0;
     int last = list.length-1;
     int mid;
     int numOfComparisions=0;
       
     while (first <= last) {           
         if((last-first)<15){
             for(int i=first;i<=last;i++){
                 numOfComparisions++;
                 if(list[i]==element){
                     System.out.println("Element "+element+" is found at location: "+(i+1));
                     return numOfComparisions;
                 }
             }
             break;
         }
           
         mid = (first + last) / 2;
         numOfComparisions++;
         if (list[mid] == element) {
              System.out.println("Element "+element+" is found at location: "+(mid+1));
             return numOfComparisions;
         } else if (list[mid] < element) {
             first = mid + 1;
         } else {
             last = mid - 1;
         }          
                      
     }
    System.out.println("Element "+element+" is not found in the list");
     return numOfComparisions;
 }
}



