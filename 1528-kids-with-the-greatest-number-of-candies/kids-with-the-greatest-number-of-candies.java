class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> child = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            int c = candies[i] + extraCandies;
            boolean flag = true;

            for (int j = 0; j < candies.length; j++) {

                if (c < candies[j]) {
                    flag = false;
                    break;
                }
            }

            child.add(flag);
        }

        return child;
    }
}