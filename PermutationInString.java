class Solution {
    public boolean ispermutation(int[] freq1,int[] freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
            
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1=new int[26];
        // int[] freq2=new int[26];

            for(int i=0;i<s1.length();i++){
                freq1[s1.charAt(i)-'a']++;
            }

    for(int i=0;i<s2.length();i++){
        int[] freq2=new int[26];
        int windowsize=0, idx=i;

        while(windowsize<s1.length() && idx<s2.length()){
            freq2[s2.charAt(idx)-'a']++;
            windowsize++;
            idx++;
        }
        if(ispermutation(freq1,freq2)){
            return true;
        }
    }
    return false;

    }
}