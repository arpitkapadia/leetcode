import java.util.*;
public class ArrayListExample {
  public static void main(String args[]) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("pink");
    for(String color: colors) {
      System.out.println(color);
    }
  }
}
