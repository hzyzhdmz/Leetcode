/**
 * Created by hzy-pc on 2016/7/5.
 */
public class Solution1 {
    public int getSum(int a,int b){
        int carry=a&b;
        int sum=a^b;
        int temp=0;
        while(carry!=0){
            carry=carry<<1;
            temp=sum;
            sum=carry^temp;
            carry=carry&temp;
        }
        return sum;

    }
}
