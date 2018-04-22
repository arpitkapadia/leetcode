import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombination {
    public List<String> letterCombinations(String digits) {
        Map<String, String> tmp_map = new HashMap<String, String>();
        tmp_map.put("1", "");
        tmp_map.put("2", "abc");
        tmp_map.put("3", "def");
        tmp_map.put("4", "ghi");
        tmp_map.put("5", "jkl");
        tmp_map.put("6", "mno");
        tmp_map.put("7", "pqrs");
        tmp_map.put("8", "tuv");
        tmp_map.put("9", "wxyz");

        List<String> out_list = new ArrayList<String>();
        if(digits.length() == 1) {
            String s = tmp_map.get(digits);
            for(char c : s.toCharArray()) {
                out_list.add(Character.toString(c));
            }
            return out_list;

        } else if(digits.length() >= 2) {
            int index = 0;
            while(digits.charAt(index) == '1') {
                index++;

            }
            String s = tmp_map.get(Character.toString(digits.charAt(index)));

            for(char c : s.toCharArray()) {
                out_list.add(Character.toString(c));
            }
            System.out.println(out_list);
            index++;
            while(index < digits.length()) {
                if(digits.charAt(index) == '1') {
                    index++;
                    continue;
                }
                List<String> out_list2 = new ArrayList<String>();
                for(char c : tmp_map.get(Character.toString(digits.charAt(index))).toCharArray()) {
                    for(int i=0; i < out_list.size(); i++) {
                        out_list2.add(out_list.get(i) + Character.toString(c));
                    }
                }
                index++;
                out_list.clear();
                out_list.addAll(out_list2);
                out_list2.clear();
                //System.out.println("in loop " + out_list);
            }
        }
        return out_list;

    }

    public static void main(String args[]) {
        LetterCombination lc = new LetterCombination();
        System.out.println(lc.letterCombinations("11231"));
    }
}