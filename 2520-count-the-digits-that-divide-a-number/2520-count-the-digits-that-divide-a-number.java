class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;

        if(num < 10){
            return 1;
        }

        while(temp != 0){
            int rem = temp % 10;
            temp /= 10;

            if(num % rem == 0){
                count++;
            }
        }
        return count;
    }
}