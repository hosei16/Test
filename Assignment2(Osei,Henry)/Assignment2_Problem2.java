import java.util.*;
public class Assignment2_Problem2 {
   public static void main(String[] args) {
    // Declare array
    int[] ids = new int[10];
    // Scanner to read data from system
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < ids.length; i++) {
     System.out.println("Please enter the ID for Person : " + (i + 1));
     ids[i] = input.nextInt();
    }
    // Array is filled till now
    //Call to find duplicates
    findDuplicates(ids);
      
    int first=findMostFrequentElement(ids);
    //Now delete this item from array and repeat the process to find most frequent elements
    //Set the positions of most frequent element as 0
    for(int i=0;i<ids.length;i++)
    {
     if(ids[i]==first)
     {
      ids[i]=0;
     }
    }
    //Call findMostFrequentElement again for finding second element
    int second=findMostFrequentElement(ids);
    System.out.println("Two most frequent Elements are : "+first +"   and "+second);
   }
   // This method is used to find duplicates in array
   static void findDuplicates(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
     for (int j = i + 1; j < array.length; j++) {
      if ((array[i] == array[j]) && (i != j)) {
       System.out.println("Duplicate Element is : " + array[j]);
       break;
      }
     }
    }
   }
  
   // Method to find most frequent element
   static int findMostFrequentElement(int[] array) {
    int count = 1, tmpCount;
    int frequentElement = array[0];
    int temp = 0;
    for (int i = 0; i < (array.length - 1); i++) {
     temp = array[i];
     tmpCount = 0;
     for (int j = 1; j < array.length; j++) {
      if (temp>0 && temp == array[j])
       tmpCount++;
     }
     if (tmpCount > count) {
      frequentElement = temp;
      count = frequentElement;
     }
    }
    return frequentElement;
   }
    
}
