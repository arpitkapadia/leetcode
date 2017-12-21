import java.util.Arrays;
class Test {
  public static void main(String args[]) {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    Arrays.fill(a1, 5);
    Arrays.fill(a2, 6);
    System.out.println(Arrays.equals(a1, a2));
    System.out.println(Arrays.binarySearch(a1, 7));
  }
}
