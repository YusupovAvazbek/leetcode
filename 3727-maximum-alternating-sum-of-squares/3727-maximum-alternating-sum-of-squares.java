class Solution {
    public long maxAlternatingSum(int[] nums) {
        int max = 0;
        int[] cnt = new int[40001];
        long total = 0;

        for (int x : nums) {
            int a = x < 0 ? -x : x;
            cnt[a]++;
            total += (long) a * a;
            if (a > max) max = a;
        }

        int neg = nums.length / 2;
        long small = 0;

        for (int v = 0; v <= max && neg > 0; v++) {
            int c = cnt[v];
            if (c == 0) continue;
            int take = Math.min(c, neg);
            small += (long) v * v * take;
            neg -= take;
        }

        return total - 2 * small;
    }
}