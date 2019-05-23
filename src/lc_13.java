import java.util.HashMap;
import java.util.Map;

public class lc_13 {
    public int romanToInt(String s) {
        Map<String ,Integer> map = new HashMap<>() ;
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int res = 0;
        for(int i=0;i<s.length();i++){
            int r = map.get(String.valueOf(s.charAt(i)));
            if(i == s.length()-1 || map.get(String.valueOf(s.charAt(i)))>=map.get(String.valueOf(s.charAt(i+1)))){
                res = res+r;
            }else {
                res = res-r;
            }
        }
        return res;


    }
}
