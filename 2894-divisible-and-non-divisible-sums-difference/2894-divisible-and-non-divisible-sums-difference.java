class Solution {
    public int differenceOfSums(int n, int m) {
        int count_divi = 0;
        int count_not = 0;

        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                count_divi += i;
            }
            else{
                count_not += i;
            }
        }

        return count_not - count_divi;
    }
}