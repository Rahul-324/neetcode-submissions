class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        if(n==0){
            return 0;

        }
        int longest=1;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int count =1;
                int y=num;
                while(set.contains(y+1)){
                    y++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
