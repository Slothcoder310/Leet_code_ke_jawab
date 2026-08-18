class Solution {
    public int hammingWeight(int n) {
        String b = Integer.toBinaryString(n);
        int count = 0;

        for(char ch : b.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        return count;
    }
}