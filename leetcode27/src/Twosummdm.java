public class Twosummdm {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i <= numbers.length; i++) {
            int nt = target - numbers[i];
            if (mp.containsKey(nt)) {
                return new int[]{mp.get(nt) + 1, i + 1};
            }
            mp.put(numbers[i], i);
        }
        return null;
    }
}
