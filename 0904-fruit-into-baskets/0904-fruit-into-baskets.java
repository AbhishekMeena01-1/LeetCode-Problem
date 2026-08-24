class Solution {
    public int totalFruit(int[] arr) {
        int l = 0, r = 0, maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > 2) {
                map.put(arr[l], map.get(arr[l]) - 1);

                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }

                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return maxLength;
    }
}