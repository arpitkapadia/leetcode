class ClimbStairs {
    public int climbStairs(int n) {
        if(n==0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);

    }
    public static void main(String args[]) {
      ClimbStairs cb = new ClimbStairs();
      System.out.println(cb.climbStairs(44));
    }
}
