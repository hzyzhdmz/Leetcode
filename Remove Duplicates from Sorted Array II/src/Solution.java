import java.util.*;

/**
 * Created by hzy-pc on 2016/7/4.
 */
public class Solution {
    public static void main(String args[]){
        Solution solution=new Solution();
        int[] nums={1,1,1,2};
        solution.removeDuplicates(nums);
    }

    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        int j=1;
        int m=0;
        int arrays=0;
        if(nums.length==0) return arrays;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int k=map.get(nums[i])+1;
                map.put(nums[i],k);
            }else{
                map.put(nums[i],j);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){
                arrays=arrays+2;
                nums[m++]=entry.getKey();
                nums[m++]=entry.getKey();
            }else {
                arrays=arrays+1;
                nums[m++]=entry.getKey();

            }
        }


        return arrays;
    }
}
