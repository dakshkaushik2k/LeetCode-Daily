class 5JULY2025{
    public int findLucky(int[] arr) {
        Map<Integer,Integer> mpp=new HashMap<>();

        for(int it:arr){
            mpp.put(it,mpp.getOrDefault(it,0)+1);
        }

        int maxi=Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
            int key=it.getKey();
            int val=it.getValue();

            if(key>=maxi && key==val){
                maxi=key;
            }
        }
        return maxi==Integer.MIN_VALUE?-1:maxi;
        
    }
}