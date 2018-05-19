public void bottomView(Node root)
{
    // Your code here
    Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

    traverseBottom(root, 1, map);
}

void traverseBottom(Node root, Map<Integer, int hd, Integer> map) {
    
    if(root == null) {
        return;
    }
    map.put(hd, root.data);

    traverseBottom(root.left, hd-1, map);
    traverseBottom(root.right, hd+1, map);

}