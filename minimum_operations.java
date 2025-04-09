class Solution {
    public int minOperations(int[] nums, int k) {
        int mini=Integer.MAX_VALUE;

        for(int n:nums){
            if(n<mini){
                mini=n;
            }
        }
        if(mini<k){
            return -1;
        }

        Set<Integer> st=new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        if(mini==k){
            return st.size()-1;
        }
        return st.size();

        
    }
}