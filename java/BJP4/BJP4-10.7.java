import java.util.*;
class BJP4107 {
    void removeDuplicates(ArrayList<String> list) {
        ArrayList<String> inp = list;
        int index = 0;
        while(index < inp.size()) {
            int tmp = index+1;
            while(tmp < inp.size() && inp.get(tmp).equals(inp.get(index))) {

                System.out.println(tmp + " " + inp.get(tmp) + " " + index);
                inp.remove(tmp);
                tmp++;
            }
            index = tmp;
        }
    }

    public static void main(String args[]){
        BJP4107 x = new BJP4107();
        ArrayList<String> n;
        n = new ArrayList<String>(Arrays.asList(new String[] {"hi", "hi", "hi", "hi"}));
        x.removeDuplicates(n);
        System.out.println(n);

    }
}
