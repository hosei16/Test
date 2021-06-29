import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Program to in-place reverse a List in Java
class Main
{
 public static<T> void reverseList(List<T> list)
 {
  // base case: list is empty or only one element is left
  if (list == null || list.size() <= 1)
   return;

  // remove first element
  T value = list.remove(0);
  
  // recuse for remaining items
  reverseList(list);
  
  // insert the top element back after recusing for remaining items
  list.add(value);
 }

 public static void main(String[] args)
 {
  List<int> colors = new ArrayList<>(Arrays.asList(12, 13, 18));

  reverseList(colors);
  System.out.println(colors);
 }
}