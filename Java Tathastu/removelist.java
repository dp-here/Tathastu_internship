import java.util.ArrayList;
import java.util.List;
public class removelist{
    public static void main(String args[]) {
  List<Integer> l1=new ArrayList<>(); //list interface object with Arraylist class.
  l1.add(10);
  l1.add(20);
  l1.add(30);
  l1.add(30);
  l1.add(40);
  System.out.println(l1);
  l1.remove(2);
  System.out.println(l1);    
    }
}