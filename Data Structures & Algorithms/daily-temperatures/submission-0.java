class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] output = new int[len];
        
        for (int i = 0; i < len - 1; ++i) {
            int j = i + 1;
            int totalDif = 0;
            boolean found = false;
            
            while (j < len) {
                totalDif++;
                if (temperatures[j] > temperatures[i]) {
                    found = true;
                    break;
                }
                j++;
            }
            
            if (found) {
                output[i] = totalDif;
            } else {
                output[i] = 0;
            }
        }
        output[len - 1] = 0;
        
        return output;
    }
}
