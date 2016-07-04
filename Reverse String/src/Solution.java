/**
 * Created by hzy-pc on 2016/7/4.
 */
public class Solution {
    public static void main(String args[]){

    }

    public String reverseString(String s){
        if(s==null) return null;
        StringBuffer s_st=new StringBuffer(s);
        String s_str=s_st.reverse().toString();
        return  s_str;

    }
}
