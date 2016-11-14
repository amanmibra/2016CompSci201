import java.util.*;

public class Tourney {
	public String winner(String[] bracket, String results) {
		Queue<String> teams = new LinkedList(Arrays.asList(bracket));
		int charCnt = 0;
		while(teams.size()!=1){
			String t1 = teams.remove();
			String t2 = teams.remove();
			if(t1.equals("bye")){
				teams.add(t2);
				continue;
			}
			else if(t2.equals("bye")){
				teams.add(t1);
				continue;
			}
			if(results.charAt(charCnt) == 'H')teams.add(t1);
			else if(results.charAt(charCnt) == 'L')teams.add(t2);
			charCnt++;
		}
		return teams.remove();
	}
}