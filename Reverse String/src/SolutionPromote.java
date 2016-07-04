/**
 * Created by hzy-pc on 2016/7/4.
 */
public class SolutionPromote {
    public static void main(String args[]){

    }

    public String reverseString(String s){
        if(s==null) return null;
        char[] s_ch=s.toCharArray();
        int s_size=s_ch.length-1;
        char temp;
        for(int i=0;i<s_ch.length/2;i++){
            temp=s_ch[i];
            s_ch[i]=s_ch[s_size-i];
            s_ch[s_size-i]=temp;
        }
        String new_str=new String(s_ch);
        return  new_str;
    }
}
