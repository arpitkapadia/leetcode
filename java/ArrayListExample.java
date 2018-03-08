import java.util.*;
public class ArrayListExample {
  public static void main(String args[]) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("pink");
    colors.add(0, "first");
    int index = colors.indexOf("red");
    System.out.println(colors.get(index));
    colors.set(index, "new");
    System.out.println("index of " + colors.indexOf("pink"))  ;
    for(String color: colors) {
      System.out.println(color);
    }
  }
}
