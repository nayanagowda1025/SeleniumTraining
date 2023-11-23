package javaprograms;
import java.util.ArrayList;
import java.util.List;

public class Test {
   public static void main(String[] args) {
      List<String> al = new ArrayList<String>();
      al.add("A");
      al.add("B");
      al.add("A");
      al.add("B");
      al.add("A");
     
      al.remove("A");
      System.out.println(al);
   }
}