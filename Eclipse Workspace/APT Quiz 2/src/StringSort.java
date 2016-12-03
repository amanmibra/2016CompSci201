import java.util.*;

public class StringSort {
	public String[] sort(String[] words) {
		Arrays.sort(words, new StrComp());
		return words;
	}
	public class StrComp implements Comparator<String> {
		public int compare(String a, String b){
			if(a.length() > b.length())return 1;
			else if(a.length() < b.length())return -1;
			return a.compareTo(b);
		}
	}
}