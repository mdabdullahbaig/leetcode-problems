// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Brute force approach
// Time Complexity = O(N*N)
// Space Complexity = O(1) because we only creating Arr

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j< nums.length; j++) {
                if(nums[i] + nums [j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
    
        return arr;
    }
}

// Optimize approach
// Time Complexity = O(N)
// Space Complexity = O(N) because we creating Map and Arr

Here we are taking arr to return and map to store nums[i]
And check whether target-nums[i] present or not 
If not present then we simply put nums[i] as key and i as value
If present then assign value to arr and return that arr;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];

        Map<Integer, Integer> map = HashMap();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
                return arr;
            }

            map.put(nums[i], i);
        }

        return arr;
    }
}