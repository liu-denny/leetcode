import static java.lang.Math.abs;

public class lc_7 {
    private static final int INT_MAX = 214748364;

    public int lc(int x){
        int res = 0;
        while (x!=0){
            if(abs(res)>INT_MAX){
                return 0;
            }
            res = res *10 + x%10;
            x=x/10;
        }
        return res;
    }
}
