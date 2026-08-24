import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int ansCount = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                ansCount++;
            }
        }
        return ansCount;
    }
}