
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the finction below
Node is as follows
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
	public static int maxLevelSum(Node root)
    {
        //add code here.
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        getSum(root, map, 0);
        //System.out.print(Collections.max(list));

        return Collections.max(map.values());


        
    }

     static void getSum(Node root, Map<Integer, Integer> map, int depth) {
        if(root == null) {
            return;
        }

        map.put(depth, map.getOrDefault(depth, 0) + root.data);

        getSum(root.left, map, depth + 1);
        getSum(root.right, map, depth + 1);
    }

}