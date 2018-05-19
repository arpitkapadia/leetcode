import java.util.*;
class Interleave {

    void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int index = 1;
        int count = 0;


        while(count < a2.size()) {
            //System.out.println(a1 + " " + a2 + " count " + count + "index " + index + " " + a1.size());

            //System.out.println(a2.get(count));
            if(a1.size() > 0) {

                a1.add(index, a2.get(count));
            } else {
                index = 0;
                a1.add(index, a2.get(count));
            }
            if(index+2 <= a1.size()) {
                index += 2;

            } else {
                index += 1;
            }
            count++;
        }
    }
    public static void main(String args[]) {
        Interleave i = new Interleave();
        ArrayList<Integer> a1 = new ArrayList<Integer> ();
        ArrayList<Integer> a2 = new ArrayList<Integer> ();
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a2.add(2);
        a2.add(2);
        a2.add(2);
        a2.add(2);
        a2.add(2);
        a2.add(2);
        i.interleave(a1, a2);
        System.out.println(a1);
    }
}




