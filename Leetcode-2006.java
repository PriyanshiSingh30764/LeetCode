class Solution {
    public int countKDifference(int[] nums, int k) {
    //bruteforce
        // int count =0;
        // for(int i =0;i<nums.length;i++)
        // {
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(Math.abs(nums[i] - nums[j]) == k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;


    //optimized approch
         Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(nums[i]-k)){
                count+= map.get(nums[i]-k);
            }
            if(map.containsKey(nums[i]+k)){
                count+= map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        
        return count;
    }
}