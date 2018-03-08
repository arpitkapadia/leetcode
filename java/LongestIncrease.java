class Solution {
	Map<Integer, Integer> tempMap = new HashMap<>();

    public int lengthOfLIS(int[] nums) {
    	int max_c = -1;
 		for(int i = 0; i < nums.length; i++) {
 			if(int count = tempMap.get(i) != null) {
 				if(max_c < count) {
 					max_c = count;
 				}
 				continue;

 			}
 			tempMap.put(i, getLIS(nums, i));

 		}			     
 		retun max_c;  
    }

    private int getLIS(int [] nums, int index) {
    	for(int i = 0; i < nums.length; i++) {
    		for(int j = i+1; j < nums.length; j++) {
    			if(tempMap)
    		}
    	}
    }
}