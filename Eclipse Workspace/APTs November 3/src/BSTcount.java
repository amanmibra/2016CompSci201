import java.util.*;

public class BSTcount {
	static Map<Long, Long> map = new HashMap<>();
	
	public long howMany(int[] values) {
		return helpCount(values.length);
      }
	long helpCount(long n) {
        long res = 0;
         
        // Base case
        if (n <= 1) {
            return 1;
        }
        if(map.containsKey(n)){
        	long intval = map.get(n);
        	long longval = new Long(intval);
        	return longval;
        }
        for (long i = 0; i < n; i++) {
            res += helpCount(i) * helpCount(n - i - 1);
        }
        map.put(n, res);
        Long longvalue = new Long(res);
        return longvalue;
    }
	
	public static void main(String args[]){
		BSTcount x = new BSTcount();
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		long ans = x.howMany(values);
		System.out.println(ans);
		System.out.println(map);
	}
   }