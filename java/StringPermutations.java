public class StringPermutations {
  public static Set<String> p = new HashSet<>();
  public static Set<String> getPermutations(String s) {
    
    int length = s.length();
    if(length == 1) {
      return s;
    }
    getP(getPermutations(s.substring(0, length-1), s.substring(length-1)));
  }
  public static String getP(String s1, String s2) {

  }
}
