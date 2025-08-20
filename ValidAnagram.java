class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] chs=s.toCharArray();

        for(char c:chs){
           map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char[] cht=t.toCharArray();

        for(char C:cht){
            if (!map.containsKey(C)) {
        return false; 
    }
            if(map.get(C)==1){
                map.remove(C);
            }else{
                map.put(C,map.get(C)-1);
            }

        }
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
}