class Solution {
    public int maxVowels(String s, int k) {
        int num = 0;
        int max = Integer.MIN_VALUE;

        char[] arr = s.toCharArray();

        for(int i = 0; i < k; i++){
            if(isVowel(arr[i])){
                num++;
            }
        }

        max = Math.max(max, num);

        for(int i = 1; i < (s.length() -  k + 1); i++){
            char rem = arr[i - 1];
            char add = arr[i + k - 1];

            if(isVowel(rem)){
                num--;
            }
            if(isVowel(add)){
                num++;
            }

            max = Math.max(max, num);
        }

        return max;
    }

    static boolean isVowel(char ch){
        return "aeiou".indexOf(ch) != -1;
    }
}