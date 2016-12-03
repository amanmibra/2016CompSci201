import java.util.*;

public class FriendScore {
	public int highestScore(String[] friends) {
		ArrayList<Set<Integer>> data = new ArrayList<Set<Integer>>();
		for(int r = 0; r < friends.length; r++){
			data.add(new HashSet<>());
			for(int c = 0; c < friends[r].length(); c++){
				if(friends[r].charAt(c) == 'Y')data.get(r).add(c);
			}
		}
		int max = 0;
		for(int i = 0; i < data.size(); i++){
			int r2 = twoFriends(i,data);
			if(r2 > max)max =r2;
		}
		return max; 
	}
	public int twoFriends(int person, ArrayList<Set<Integer>> data){
		Set<Integer> s = new HashSet<>();
		data.get(person).forEach(i -> s.addAll(data.get(i)));
		s.addAll(data.get(person));
		return s.size() -1; 
	}
}