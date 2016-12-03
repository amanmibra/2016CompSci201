import java.util.*;

public class QBalance {
	String left = "{[(";
	String right = "}])";
	String all = left + right;
	int Ssize = 0;
	public int bindex(String symbols) {
		Ssize = symbols.length();
		Stack<Integer> st = new Stack<Integer>();
		for(int i =0; i<symbols.length(); i++){
			char c = symbols.charAt(i);
			if(all.indexOf(c) == -1)continue;
			
			int lin = left.indexOf(c);
			if(lin >= 0)st.push(lin);
			else{
				int rin = right.indexOf(c);
				if(st.size() == 0 || st.peek() != rin){
					return i;
				}
				st.pop();
			}
		}
		if(st.size() != 0)return Ssize;
		return -1;
	}
}	