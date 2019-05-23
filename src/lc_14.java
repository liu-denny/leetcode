/**
 * @author yudong
 * @create 2019-05-08 10:14
 */
public class lc_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return " ";
        }
        String res = new String();
        for(int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>strs[j].length()-1 || strs[j].charAt(i) != c){
                    return res;
                }
            }
            res = res+Character.toString(c);
        }
        return res;
    }
}
