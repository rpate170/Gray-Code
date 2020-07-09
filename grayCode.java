class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        
        result.add(0);
        for (int i = 0b1; Integer.numberOfTrailingZeros(i) < n; i <<= 1) {
            for (int j = result.size()-1; j >= 0; j--) {
                result.add(i | result.get(j));
            }
        }
        return result;
    }
}