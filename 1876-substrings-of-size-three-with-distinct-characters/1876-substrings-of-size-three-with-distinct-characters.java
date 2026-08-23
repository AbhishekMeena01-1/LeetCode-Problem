class Solution {
    public int countGoodSubstrings(String s) {

        int i = 0, j = 0, count = 0;

        while (j < s.length()) {

            if (j - i + 1 < 3) {
                j++;
            } else {

                HashSet<Character> set = new HashSet<>();

                set.add(s.charAt(i));
                set.add(s.charAt(i + 1));
                set.add(s.charAt(i + 2));

                if (set.size() == 3) {
                    count++;
                }

                i++;
                j++;
            }
        }

        return count;
    }
}