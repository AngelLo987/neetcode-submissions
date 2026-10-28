class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> frequency = new HashMap<>(); 
        //frquency array to keep track of how many of each number is inside 
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());
        for (int i = 0; i < nums.length; i++){
            if (frequency.containsKey(nums[i])){
                frequency.put(nums[i],(frequency.get(nums[i])+1));
            }
            else{ 
                frequency.put(nums[i],1);
            }
        }
        

        for (Map.Entry<Integer,Integer> entry : frequency.entrySet()){
                minHeap.add(entry);
            
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        

    int[] result =new int[k];
    int index = 0; 

    while (!minHeap.isEmpty()){
        Map.Entry<Integer, Integer> entry = minHeap.poll(); 
        result[index] = entry.getKey(); 
        index++;
    }
    return result;
    }
}
