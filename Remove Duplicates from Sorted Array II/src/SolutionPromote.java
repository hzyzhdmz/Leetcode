/**
 * Created by hzy-pc on 2016/7/4.
 */
public class SolutionPromote {
    public static void main(String args[]){

    }

    public int removeDuplicates(int[] nums){
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
        }
    }

