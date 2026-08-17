class Solution {
        Map<Character,Integer> map_p;
        Map<Character, Integer> map_s;

        public boolean isAnagram(){
            for(char ch : map_p.keySet()){
                if(!map_s.containsKey(ch)){
                    return false;
                }
                if(!map_s.get(ch).equals(map_p.get(ch))){
                    return false;
                }
            }
            return true;
        }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int s_len = s.length();
        int p_len = p.length();

        if(p_len > s_len){
            return ans;
        }

        map_p = new HashMap<>();

        for(int i = 0; i < p_len; i++){
            char ch = p.charAt(i);

            map_p.put(ch, map_p.getOrDefault(ch, 0) + 1);
        }

        map_s = new HashMap<>();

        for(int i = 0; i < p_len; i++){
            char ch = s.charAt(i);

            map_s.put(ch, map_s.getOrDefault(ch,0) + 1);
        }

        if(isAnagram()){
            ans.add(0);
        }

        for(int i = 1; i < s_len - p_len + 1; i++){
            char add = s.charAt(i + p_len - 1);
            map_s.put(add, map_s.getOrDefault(add,0) + 1);
            char rem = s.charAt(i - 1);
            map_s.put(rem, map_s.getOrDefault(rem,0) - 1);

            if(isAnagram()){
                ans.add(i);
            }
        }
        return ans;
    }
}