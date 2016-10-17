import java.util.*;

public class Anonymous {
	public static void main(String[] args){
		Anonymous x = new Anonymous();
		String[] headlines = new String[]{"abcdef","abcdef"};
		String[] messages = new String[]{"AaBbCc","aabbbcc","   ","FADE"};
		System.out.println(x.howMany(headlines, messages));
	}
	public int howMany(String[] headlines, String[] messages) {
		int answer = 0;
		List<Character> letters = new ArrayList<Character>();
		for(String s : headlines){
			for(char c: s.trim().toLowerCase().toCharArray()){
				letters.add(c);
			}
		}
		for(String s : messages){
			boolean works = isRight(new ArrayList<Character>(letters), s);
			if(works == true){
				answer++;
			}
		}
		
		return answer;
	}
	public boolean isRight(List<Character> charList, String s){
		s = s.trim().toLowerCase();
		boolean works = true; 
		Collections.sort(charList);
		for(char c : s.toCharArray()){
			if(charList.contains(c)){
				int index = Collections.binarySearch(charList, c);
				charList.remove(index);
			}
			else{
				works = false;
				break;
			}
		}
		return works;
	}
}
