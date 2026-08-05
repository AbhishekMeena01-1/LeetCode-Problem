class Solution {

    public int findTheWinner(int n, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        return josephus(list, k, 0);
    }

    public int josephus(ArrayList<Integer> list, int k, int index) {

        if(list.size() == 1) {
            return list.get(0);
        }

        int idx = (index + k - 1) % list.size();

        list.remove(idx);

        return josephus(list, k, idx);
    }
}