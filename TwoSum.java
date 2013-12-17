public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i ++) {
            if (dict.containsKey(target - numbers[i])) {
                return new int[] {dict.get(target - numbers[i]), i + 1};
            } else {
                dict.put(numbers[i], i + 1);
            }
        }
        return new int[] {-1, -1};
    }
}