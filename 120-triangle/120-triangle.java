class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
          for(int i = triangle.size() - 2; i >= 0; i--) {  //row by row from end
            for(int j = 0; j < triangle.get(i).size(); j++){
                int curr = triangle.get(i).get(j);
                curr += Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                triangle.get(i).set(j, curr);
            }
        }
        return triangle.get(0).get(0);
    }
}