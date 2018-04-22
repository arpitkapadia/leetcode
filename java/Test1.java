import java.util.*;
public class Test1 {


    public static boolean isSorted(Stack<Integer> s) { 
        int size = s.size(); int count = 0; 
        if(size < 2) { return true; } 
        Queue<Integer> q = new LinkedList<Integer>(); 
        int last = s.pop(); int first = s.pop(); 
        while(count < size-2) 
        { 
            if(last > first) { 
                return false; 
            } 
            q.add(last); last = first; first = s.pop(); count++; 
        } 
        return true; 
    }
    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>(); 

        int count = s.size();
        while(count-- > 0) {
            System.out.println(count + "count");
            q.add(s.pop());
        }
        count = q.size();
        while(count-- > 0) {
            int tmp = q.remove();
            if(tmp < 0) {
                s.push(tmp);
            }
            else {
                q.add(tmp);
            }
        }
        
        while(!q.isEmpty()) {
            s.push(q.remove());
        }
    }


    public static void mirror(Stack<Integer> s) {
        
    }

    public static void stutter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while(!s.isEmpty()) {
            int tmp = s.pop();
            q.add(tmp);
            q.add(tmp);
        }

        while(!q.isEmpty()) {
            s.push(q.remove());
        }

        while(!s.isEmpty()) {
            int tmp = s.pop();
            q.add(tmp);
        }

        while(!q.isEmpty()) {
            s.push(q.remove());
        }

    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int end = sc.nextInt();
        while(count < end ){
            st.push(sc.nextInt());
            count++;

        }
        System.out.println(st);

        stutter(st);
        System.out.println(st);

    }
}
