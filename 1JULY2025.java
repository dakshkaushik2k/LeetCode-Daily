class 1JULY2025 {
    public int possibleStringCount(String word) {
        int cnt=1;
        for(int i=1;i<word.length();i++){
            char curr=word.charAt(i);
            char prev=word.charAt(i-1);
            if(curr==prev){
                cnt++;
            }
        }
        return cnt;
        
    }
}