class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sortedNames = new String[n];
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (heights[j] == sortedHeights[n - 1 - i]) {
                    sortedNames[i] = names[j];
                    break;
                }
            }
        }
        return sortedNames;
    }
}
