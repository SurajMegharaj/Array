import java.util.*;
class ArrayListExp
{
public static void main(String args[])
{ // create an array list
ArrayList al = new ArrayList();
System.out.println("Initial size of al: " +al.size());
// add elements to the array list
al.add("Chennai");
al.add("Bangalore");
al.add("Mysore");
al.add("Delhi");
al.add("Calcutta");
System.out.println("Size of al after additions: " +al.size());
// display the array list
System.out.println("Contents of al: " + al);
// add the element at the end
al.add("Mumbai");
System.out.println("Size of al after additions: " +al.size());
System.out.println("Contents of al: " + al);
// add the element at the specified index
al.add(3,"Trichy");
System.out.println("Size of al after additions: " +al.size());
System.out.println("Contents of al: " + al);
// Remove elements from the array list
//al.remove("F");
//al.remove(2);
//System.out.println("Size of al after deletions: " +al.size());
//System.out.println("Contents of al: " + al);
}
}
